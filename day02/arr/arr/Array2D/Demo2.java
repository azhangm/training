package day02.arr.arr.Array2D;

import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        int[][] a = new int[3][5];
        Random r = new Random();
        for (int i = 0; i < a.length ; i ++) {
            for (int j = 0 ; j < a[i].length ; j ++) {
                a[i][j]  = r.nextInt(70 - 30 + 1 ) + 30;
                }
            }
        int sum = 0;
        for (int[] ints : a) {
            sum += ints[4];
        }

        System.out.println("第四列的平均值=" + (sum * 1.0) / 3 );

        }
    }
