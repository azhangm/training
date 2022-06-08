package day02.arr.arr.homework;

import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(80 - 10 + 1) + 10;
            System.out.print( a[i] + " ");
        }
        System.out.println();
        reserve(a);
        System.out.println("反转后的数组");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    private static void reserve(int[] a) {
        int i = 0;
        int j = a.length - 1;
        for (; i < j ; i ++ , j --) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }
}
