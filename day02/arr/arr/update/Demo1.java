package day02.arr.arr.update;
/*
*
* ����Ĳ������
*
* */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {35,22,17,41,72,39,10,0,0,0};
        int num = 66; // Ҫ���������
        int idx = 1; // Ҫ�����λ��

        // ���鵹���ƶ�
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
