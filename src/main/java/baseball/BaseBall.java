package baseball;

import ui.InputView;
import ui.ResultView;
import utils.MakeRandomNum;

import java.util.Scanner;

public class BaseBall {
    public void game(){
        // computer num
        MakeRandomNum randomNum = new MakeRandomNum();
        Balls answer = new Balls(randomNum.makeRandomNum());

        // user num
        Scanner sc = new Scanner(System.in);
        int strike = 0;

        while(strike != 3) {
            System.out.print("숫자를 입력해 주세요 : ");
            int userInput = sc.nextInt();

            strike = ResultView.result(answer.play(InputView.splitNumber(userInput)));
        }

    }
    public BaseBall() {
        while(true){
            game();
            if(InputView.inputNumber()==2) return;
        }
    }

    public static void main(String[] args) {
        new BaseBall();
    }
}
