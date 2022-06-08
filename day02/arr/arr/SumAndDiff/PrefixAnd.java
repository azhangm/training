package day02.arr.arr.SumAndDiff;

public class PrefixAnd {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("------------------");
//      ����  ǰ׺������  ��ʾ [0,i] �����ǰ׺��
        int[] prefixSum = new int[10];
        prefixSum[0] = arr[0];

        for (int i = 1 ; i < prefixSum.length; i ++) {
            prefixSum[i] = arr[i] + prefixSum[i - 1];
        }

        for (int i : prefixSum) {
            System.out.print(i + " ");
        }
        System.out.println();
        // ������ [3,5] �� �����
        System.out.println(prefixSum[5] - prefixSum[2]);

        }
}
