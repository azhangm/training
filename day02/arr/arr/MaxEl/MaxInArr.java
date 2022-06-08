package day02.arr.arr;

import java.util.Random;

public class MaxInArr {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length ; i ++) {
            arr[i] = random.nextInt(100 - 90 + 1) + 10;
        }
        int max = 0;
        int min = 0;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("-------------");
        for (int i = 0 ; i < arr.length ; i ++ ) {
          max =  arr[i] > arr[max] ? i : max;
          min = arr[i ] < arr[min] ? i : min;
        }
        for (int i = max ; i < arr.length ; i ++){
            if (arr[max] == arr[i]) {
                System.out.println("maxÏÂ±ê" + i);
            }
            }
    }
}
