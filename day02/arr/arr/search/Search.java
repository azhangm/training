package day02.arr.arr;

import java.util.Random;

public class Search {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        boolean flag = false;

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(30 - 10 + 1) + 10;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 18) {
                flag = true;
                System.out.println(i);
            }
        }

        if (!flag) {
            System.out.println("数组中不包含18");
        }

    }
}
