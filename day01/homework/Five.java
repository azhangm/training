package day01.homework;

import java.util.InputMismatchException;

public class Five {
    public static void main(String[] args) {
        int sum = 0;
        for (int k = 1;k <= 4;k++) {
            int ret = 1;
            for (int j = 1; j <= k; j++) {
                ret *= j;
            }
            sum += ret;
        }
        System.out.println(sum);
    }
}
