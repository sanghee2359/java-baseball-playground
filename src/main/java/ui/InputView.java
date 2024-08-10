package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    public static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static List<Integer> splitNumber(int userNumber) {

        List<Integer> userNumList = new ArrayList<>();
        userNumList.add(userNumber / 100);
        int tmp = userNumber % 100;
        userNumList.add(tmp / 10);
        userNumList.add(tmp % 10);

        return userNumList;
    }
}
