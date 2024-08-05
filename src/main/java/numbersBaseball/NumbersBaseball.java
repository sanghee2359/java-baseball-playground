package numbersBaseball;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersBaseball {
    public static int[] check = new int[10]; // 1 ~ 9

    public int duplicateCheck(int[] number, int idx, int num) {
        if(check[num] == 0) {
            number[idx] = num;
            check[num] = idx + 1; // 인덱스값 저장
            idx++;
        }
        return idx; //현재 idx 반환
    }
    public void makeRandomNumber(int[] number) {
        int idx = 0;

        while (idx != 3) {
            int cur = ((int)(Math.random()*8)+1); // random number 생성
            idx = duplicateCheck(number, idx, cur);
        }
        System.out.println(Arrays.toString(number));
    }

    public int compareTo(int[] compareNum){
        // 초기화
        int strike = 0, ball = 0;
        boolean nothing=false;

        for (int i = 1; i <= 3; i++) {
            int cur = compareNum[i];

            if(check[cur] != 0 && check[cur] == i) {
                strike++;
                continue;
            }
            if(check[cur] != 0) {
                ball++;
            }
        }
        if(strike == 0 && ball == 0) nothing = true;
        if(!nothing) {
            System.out.println(strike + " 스트라이크");
            System.out.println(ball + " 볼");
            return strike;
        }
        System.out.println("낫싱");
        return 0;
    }

    public void game(int[] number) {
        Scanner sc = new Scanner(System.in);
        int strike = 0;
        makeRandomNumber(number);


        while(strike != 3) {
            System.out.print("숫자를 입력해 주세요 : ");

            int num = sc.nextInt();
            int[] compareNum = new int[4];
            compareNum[1] = num / 100;
            compareNum[2] = (num % 100) / 10;
            compareNum[3] = (num % 10);

            strike = compareTo(compareNum);

        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
    public NumbersBaseball() {
        int[] number = new int[3];
        while (true) {
            game(number);

            Scanner sc = new Scanner(System.in);
            int in = sc.nextInt();
            if(in == 2) return;
        }
    }
    public static void main(String[] args) {
        new NumbersBaseball();
    }

}
