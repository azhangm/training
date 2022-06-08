package day02.arr.arr.homework;

import java.util.Random;

public class HomeWork2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(80 - 10 + 1) + 10;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int[] b = new int[10];
        arrayCopy(a,b);
        System.out.println("复制后的数组");
        for (int i : b) {
            System.out.print(i + " ");
        }
    }

    private static void arrayCopy(int[] src, int[] target) {
        if (target.length < src.length) return;
        for (int i = 0; i < target.length; i++) {
            target[i] = src[i];
        }
    }
}
