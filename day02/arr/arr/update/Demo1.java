package day02.arr.arr.update;
/*
*
* 数组的插入操作
*
* */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {35,22,17,41,72,39,10,0,0,0};
        int num = 66; // 要插入的数据
        int idx = 1; // 要插入的位置

        // 数组倒着移动
        for (int i = arr.length - 1; i > idx ; i -- ) {
            arr[i] = arr[i - 1];
        }
//        System.arraycopy(arr, idx, arr, idx + 1, arr.length - 1 - idx);

        arr[idx] = num;

        for (int i : arr) {
            System.out.print(i + " ")   ;

        }
    }
}
