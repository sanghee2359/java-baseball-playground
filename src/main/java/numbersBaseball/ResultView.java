package numbersBaseball;

public class ResultView {
    public static String scoreResult(int strike, int ball) {
        String result = "";
        if(ball != 0) result += (ball+"볼 ");
        if(strike != 0) result += (strike+"스트라이크");
        if(ball == 0 && strike == 0) result += "낫싱";
        return result;
    }

}
