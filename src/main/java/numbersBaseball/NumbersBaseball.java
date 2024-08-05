package numbersBaseball;

import java.util.Arrays;

public class NumbersBaseball {
    public static int[] number = new int[3];
    public static boolean[] check = new boolean[10];

    public int duplicateCheck(int[] number, int idx, int num) {
        if(!check[num]) {
            number[idx] = num;
            check[num] = true;
            idx++;
        }
        return idx; //현재 idx 반환
    }
    public void makeRandomNumber() {
        int idx = 0;
        while (idx != 3) {
            int cur = ((int)(Math.random()*8)+1); // random number 생성
            idx = duplicateCheck(number, idx, cur);
        }
    }

    public static void main(String[] args) {
        NumbersBaseball T = new NumbersBaseball();
        T.makeRandomNumber();
        System.out.println(Arrays.toString(number));
    }

}
