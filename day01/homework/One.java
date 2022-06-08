package day01.homework;

import java.util.Random;

public class One {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        double average = 0;
        for (int i = 0; i < 5 ; i ++ ) {
            sum += random.nextInt(20 - 10 + 1) + 10;
        }
        average = (double)sum / 5;
        System.out.println("随机数的和 : " + sum);
        System.out.println("随机数的平均值" + average);
    }
}
