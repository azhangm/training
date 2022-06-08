package day02.arr.arr.SumAndDiff;
/*
* 构造差分数组  差分求前缀和 就是原数组
*
* 在 区间[ i , j ] 加上 数字 为 O（1）的复杂度
*
* 差分公式 ： diff(x) = f(x ) - f(x - 1)  x 取值 : 看数组下标的选取
*
* diff(x) 定义为 [x - 1 , x] 之间的差分
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
//      定义  差分数组  表示 [0,i] 区间的差分
            int[] diff = new int[10];

            for (int i = 1 ; i < diff.length; i ++) {
                diff[i] = arr[i] - arr[i - 1];
            }
            System.out.println("-------------------------------");
            for (int i : diff) {
                System.out.print(i + " ");
            }
            System.out.println();
            // 在区间 [3,5] 之间加3
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

