package day02.arr.arr.Array2D;

import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] a = new int[3][5];
        int x = 0;
        int y = 0;
        int max = 0;
        for (int i = 0; i < a.length ; i ++) {
            for (int j = 0 ; j < a[i].length ; j ++) {
                a[i][j]  = r.nextInt(70 - 30 + 1 ) + 30;
                if (a[i][j] > max) {
                    max = a[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        for (int[] ints : a) {
            for (int s : ints) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        for (int i = x ; i < a.length ; i ++) {
            for (int j = y ; j < a[i].length ; j ++) {
                if (max == a[i][j]) {
                    System.out.println("зјБъ" + "(" + i + "," + j +")");
                }
            }
        }
    }
}
