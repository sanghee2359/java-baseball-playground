package baseball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BallsNumber {

    public List<Integer> splitNumber(int userNumber) {

        List<Integer> userNumList = new ArrayList<>();
        userNumList.add(userNumber / 100);

        int tmp = userNumber % 100;
        userNumList.add(tmp / 10);
        userNumList.add(tmp % 10);

        return userNumList;
    }

    public static boolean validateNumber(List<Integer> ballNumbers) {
        boolean validation = false;

        for (Integer x : ballNumbers) {
            if(! (0 < x && x < 10)) {
                System.out.println("중복 숫자가 없는 수를 입력해주세요.");
                return validation;
            }
            if(!(Collections.frequency(ballNumbers, x) == 1)) {
                System.out.println("1~9 사이 숫자로 이루어진 수를 입력해주세요.");
                return validation;
            }
        }

        return true;
    }

}

