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
}