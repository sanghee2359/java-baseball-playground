package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private List<Ball> balls;

    public Balls(List<Integer> computer) {
        this.balls = getBalls(computer);
    }

    private static List<Ball> getBalls(List<Integer> computer) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            balls.add(new Ball(i+1, computer.get(i)));
        }
        return balls;
    }

    public BallStatus play(Ball ball) {
        return balls.stream()
                .map(answer -> answer.play(ball))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }
}
