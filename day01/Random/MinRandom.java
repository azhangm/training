package day01.Random;

import java.util.Random;

public class MinRandom {
    public static void main(String[] args) {
        int minRandom =new Random().nextInt(71) + 10;
        System.out.println("生成的随机数");
        System.out.print(minRandom + " ");
        for (int i = 1; i < 5; i++) {
            int  random = new Random().nextInt(71) + 10;
            System.out.print(random + " ");
            minRandom = Math.min(random, minRandom);
        }

        System.out.println("最小" + minRandom);
    }
}
