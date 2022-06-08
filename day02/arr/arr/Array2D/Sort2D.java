package day02.arr.arr.Array2D;

import java.util.Random;

public class Sort2D {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] a = new int[3][5];
        for (int i = 0 ; i < a.length ; i ++) {
            for (int j = 0 ; j < a[i].length; j ++) {
                a[i][j] = r.nextInt(70 - 30 + 1) + 30;
            }
        }

        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        // sort
        for (int i = 0 ; i < a.length - 1 ; i ++) {
            for (int j = 0; j < a.length - i - 1 ; j ++) {
                if (a[j][1] > a[j+1][1]){
                    int temp = a[j][1];
                    a[j][1] = a[j+1][1];
                    a[j+1][1] = temp;
                }
            }

        }
        System.out.println("-------------------");
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
