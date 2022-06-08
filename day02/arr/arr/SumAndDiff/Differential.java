package day02.arr.arr.SumAndDiff;
/*
* ����������  �����ǰ׺�� ����ԭ����
*
* �� ����[ i , j ] ���� ���� Ϊ O��1���ĸ��Ӷ�
*
* ��ֹ�ʽ �� diff(x) = f(x ) - f(x - 1)  x ȡֵ : �������±��ѡȡ
*
* diff(x) ����Ϊ [x - 1 , x] ֮��Ĳ��
* */
public class Differential {
        public static void main(String[] args) {
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }
            for (int i : arr) {
                System.out.print(i + " ");
            }

            System.out.println("------------------");
//      ����  �������  ��ʾ [0,i] ����Ĳ��
            int[] diff = new int[10];

            for (int i = 1 ; i < diff.length; i ++) {
                diff[i] = arr[i] - arr[i - 1];
            }
            System.out.println("-------------------------------");
            for (int i : diff) {
                System.out.print(i + " ");
            }
            System.out.println();
            // ������ [3,5] ֮���3
            System.out.println("-------------------------------");
            diff[3] += 3;
            diff[6] -= 3;
            arr[0] = diff[0];
            for (int i = 1; i < diff.length ; i ++ ) {
                arr[i] = diff[i] + arr[i-1];
            }
            for (int i : arr) {
                System.out.print(i + " ");
            }

        }
    }

