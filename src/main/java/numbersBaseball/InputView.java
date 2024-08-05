package numbersBaseball;

import java.util.Scanner;

public class InputView {
    public static int[] check = new int[10]; // 1 ~ 9

    // 3자리 수 입력 받기
    public static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    // 랜덤 수 3자리 생성
    public static int duplicateCheck(int[] randomNum, int idx, int num) {
        if(check[num] == 0) {
            randomNum[idx] = num;
            check[num] = idx + 1; // random number 각 인덱스값 저장
            idx++;
        }
        return idx; //현재 idx 반환
    }
    public static void makeRandomNumber(int[] randomNum) {
        int idx = 0;

        while (idx != 3) {
            int cur = ((int)(Math.random()*8)+1); // random number 생성
            idx = duplicateCheck(randomNum, idx, cur);
        }
    }


    // validation
    public static boolean validateNumber(int[] numList) {
        boolean verification = false;

        if(numList[1] == numList[2] || numList[2] == numList[3]
                || numList[1] == numList[3]) {
            System.out.println(ValidationError.duplication);
            return verification;
        }

        for (int i = 1; i < numList.length; i++) {
            int num = numList[i];
            if(!((0 < num) && (num < 10))) {
                System.out.println(ValidationError.intermediateValue);
                return verification;
            }
        }

        return true;
    }

    // 정수 쪼개기
    public static int[] splitNumber(int inputNum) {
        int[] numList = new int[4];

        numList[1] = inputNum / 100;
        numList[2] = (inputNum % 100) / 10;
        numList[3] = (inputNum % 10);

        return numList;
    }
}
