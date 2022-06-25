package day08.Normal;

import day02.arr.arr.Array;

import java.util.Arrays;

public class A {
    public static void main(String[] args) {
        int[] arr = {36,14,32,22,44,11};
        Arrays.sort(arr);
        int[] arr2 = Arrays.copyOf(arr,10);
        int[] ints = Arrays.copyOfRange(arr, 2, 5);
        System.out.println(Arrays.binarySearch(arr, 11));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(ints));
        System.out.println(ints.length == 5 - 2 );
        Arrays.fill(arr,2 , 3 ,3);
        System.out.println(Arrays.toString(arr));

    }
}
