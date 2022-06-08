package day01.Random;

import java.util.Random;

public class MaxRandom {
    public static void main(String[] args) {
        int maxRandom = 0;
        System.out.println("生成的随机数");

        for (int i = 0; i < 5; i++) {
           int  random = new Random().nextInt(71) + 10;
            System.out.print(random + " ");
            maxRandom = Math.max(random, maxRandom);
        }

        System.out.println(maxRandom);
    }
}
