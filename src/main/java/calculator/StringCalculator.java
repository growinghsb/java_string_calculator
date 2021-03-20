package calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

/**
 * 구현 기능
 * 1. 문자열을 입력 받는다.
 * 2. 해당 문자열이 비었는지, 검사한다.
 * 3. 커스텀 문자가 포함 되었는지 확인한다.
 * 3-1. 커스텀 문자 = //Custom<<의 양식을 따른다
 * 4. 문자열을 자른다.
 * 5. 계산한다.
 */

public class StringCalculator {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String formula = blankCheck(inputFormula());
    }

    public static String inputFormula() {
        return scanner.nextLine();
    }

    public static String blankCheck(String formula) {
        if (formula.isBlank()) {
            return "0";
        }
        return formula;
    }

    public static String[] formulaSplit(String formula) {
        if (formula.contains("/")) {
            String customFormula = customCharacterExtraction(formula);

            char customSeparator = customFormula.charAt(0);
            formula = customFormula.substring(1);

            return formula.split(customSeparator + "");
        }
        return formula.split(",|;");
    }

    public static String customCharacterExtraction(String formula) {
        Matcher matcher = compile("//(.)<<(.*)").matcher(formula);
        while (matcher.find()) {
            formula = matcher.group(1) + matcher.group(2);
        }
        return formula;
    }

    public static int add(String[] formula) {
        int sum = 0;
        for (String s : formula) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }

    public static void printResult(int result) {
        System.out.println("결과 = " + result);
    }
}
