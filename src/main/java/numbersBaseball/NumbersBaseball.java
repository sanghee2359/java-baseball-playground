package numbersBaseball;

public class NumbersBaseball {

    public int compareTo(int[] compareNum){
        // 초기화
        int strike = 0, ball = 0;

        for (int i = 1; i <= 3; i++) {
            int cur = compareNum[i];

            if(InputView.check[cur] != 0 && InputView.check[cur] == i) {
                strike++;
                continue;
            }
            if(InputView.check[cur] != 0) {
                ball++;
            }
        }
        System.out.println(ResultView.scoreResult(strike, ball));
        return strike;
    }

    public void game(int[] randomNum) {
        int strike = 0,  ball = 0;
        InputView.makeRandomNumber(randomNum);

        while(strike != 3) {
            System.out.print("숫자를 입력해 주세요 : ");

            int inputNum = InputView.inputNumber();
            int[] inputList = InputView.splitNumber(inputNum);
            if(InputView.validateNumber(inputList))
            strike = compareTo(inputList);


        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
    public NumbersBaseball() {
        int[] randomNum = new int[3];
        while (true) {
            game(randomNum);

            if(InputView.inputNumber() == 2) return;
        }
    }
    public static void main(String[] args) {
        new NumbersBaseball();
    }

}
