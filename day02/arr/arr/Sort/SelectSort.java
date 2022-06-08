package day02.arr.arr.Sort;

public class SelectSort {
    public static void main(String[] args) {

        int[] arr = {67,42,88,16,25,3};

        int min = 0;
        // [0..i]  ÓÐÐòÇø
        for (int i = 0; i < arr.length - 1; i ++ ) {
            for (int j = i + 1; j < arr.length ; j ++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
