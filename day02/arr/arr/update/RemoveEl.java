package day02.arr.arr.update;


public class RemoveEl {
    public static void main(String[] args) {
        int[] arr = {35,22,17,41,72,39,10,2,2,3};
        int idx = 1;
        for (; idx < arr.length - 1; idx ++) {
            arr[idx] = arr[idx + 1];
        }
//      �ӵ� ���ƶ����Ժ����һ��������0 ��Ϊ���ƶ������һ��Ԫ����
        arr[idx] = 0;
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
