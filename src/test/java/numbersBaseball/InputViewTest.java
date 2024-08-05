package numbersBaseball;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {
    // 난수 생성 테스트
    @Test
    void makeRandomNumTest() {
        int[] randomNum = new int[3];

        InputView.makeRandomNumber(randomNum);
        for (int i = 0; i < randomNum.length; i++) {
            assertThat(0 < randomNum[i] && randomNum[i] <10).isEqualTo(true);
            assertThat(InputView.check[randomNum[i]]).isNotZero();
        }
    }
    // 각 자리수를 정수 배열로 생성하는 테스트
    @Test
    void splitNumTest() {
        int num = 235;
        int[] numList = InputView.splitNumber(num);
    assertThat(Arrays.toString(numList)).isEqualTo("[0, 2, 3, 5]"); // idx 1~3 사용
    }

    /**
     * 입력값 유효성 검증 테스트
     */
    @Test
    void validateNumTest_success() {
        int[] numList = InputView.splitNumber(146);
        assertThat(InputView.validateNumber(numList)).isEqualTo(true);
    }

    // 사용자가 중복값 입력 시 false
    @Test
    void validateNumTest_fail1() {
        int[] numList = InputView.splitNumber(444);
        assertThat(InputView.validateNumber(numList)).isEqualTo(false);
    }
    // 사용자가 1~9 이외의 값 입력 시
    @Test
    void validateNumTest_fail2() {
        int[] numList = InputView.splitNumber(405);
        assertThat(InputView.validateNumber(numList)).isEqualTo(false);
    }
}