package calculator;

import java.util.Scanner;

/**
 * 구현 기능
 * 1. 문자열을 입력 받는다.
 * 2. 해당 문자열이 비었는지, 검사한다.
 * 3. 커스텀 문자가 포함 되었는지 확인한다.
 *  3-1. 커스텀 문자 = //Custom<<의 양식을 따른다
 * 4. 문자열을 자른다.
 * 5. 계산한다.
 */

public class StringCalculator {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static String inputFormula(){
        return scanner.nextLine();
    }


}
