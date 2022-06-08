package day02.arr.arr.update;

public class MoveZero {
    public static void main(String[] args) {
//        int[] arr = {35,0,17,0,72,39,10};
//        int j = 0;
//
//        for (int i = 0 ; i < arr.length ; i ++) {
//                if (arr[i] != 0) {
//                    arr[j ++] = arr[i];
//                }
//        }
//
//        for (; j < arr.length; j ++) {
//            arr[j] = 0;
//        }
//
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

        int[] arr = {35,0,17,0,72,39,10};

        int j = 0;
        for (int i = 0 ; i < arr.length ; i ++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                if (i != j) {
                    arr[i] = 0;
                }
                j ++;
            }
        }
        System.out.println("ÁãµÄ¸öÊý" + ( arr.length - j));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
