package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {


    @Test
    @DisplayName("공백 입력 '0' 반환, 문자열 그대로 반환")
    public void inputFormulaBlankCheck() {
        //준비
        String checkResultZero = StringCalculator.blankCheck(" ");
        String checkResultFormula = StringCalculator.blankCheck("1,2;3");

        //실행


        //단언
        assertThat(checkResultZero).isEqualTo("0");
        assertThat(checkResultFormula).isEqualTo("1,2;3");


    }

    @Test
    @DisplayName("커스텀 문자 추출")
    public void customCharacterExtraction() {
        //준비
        String customCharacter = StringCalculator.customCharacterExtraction("//:<<1:2:3");

        //실행


        //단언
        assertThat(customCharacter).isEqualTo(":1:2:3");


    }

    @Test
    @DisplayName("계산식 구분자로 자르기, String 배열 반환")
    public void formulaSplit() {
        //준비
        String[] formula = StringCalculator.formulaSplit("1,2;2;3");
        String[] customCharacterFormula = StringCalculator.formulaSplit("//:<<1:2:3");

        //실행


        //단언
        assertThat(formula.length).isEqualTo(4);
        assertThat(customCharacterFormula[0]).isEqualTo("1");
        assertThat(customCharacterFormula.length).isEqualTo(3);


    }

    @Test
    @DisplayName("더하기 결과 반환")
    public void add() {
        //준비
        int result = StringCalculator.add(new String[] {"1", "2"});

        //실행


        //단언
        assertThat(result).isEqualTo(3);

    }
}