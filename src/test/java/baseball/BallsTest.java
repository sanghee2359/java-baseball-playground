package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {
    // Step 2.
    @Test
    @DisplayName("userball 1개와 computerball 리스트를 가지고 비교 - strike")
    void strike() {
        Balls computerBall = new Balls(Arrays.asList(1, 2, 3));
        assertThat(computerBall.play(new Ball(1, 1))).isEqualTo(BallStatus.STRIKE);

    }
    @Test
    @DisplayName("userball 1개와 computerball 리스트를 가지고 비교 - ball")
    void ball() {
        Balls computerBall = new Balls(Arrays.asList(1, 2, 3));
        assertThat(computerBall.play(new Ball(1, 3))).isEqualTo(BallStatus.BALL);

    }
    @Test
    @DisplayName("userball 1개와 computerball 리스트를 가지고 비교 - nothing")
    void nothing() {
        Balls computerBall = new Balls(Arrays.asList(1, 2, 3));
        assertThat(computerBall.play(new Ball(1, 4))).isEqualTo(BallStatus.NOTHING);

    }
}
