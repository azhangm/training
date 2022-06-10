package day03.Method;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
//        System.out.println( "用户输入的数字是" + getPrint());
//        System.out.println("几位数：" + count(1000));
//        System.out.println("有几个含7的数字 " + countN(7,1,100) );
//        printSanJiao(4,10,"@");
//        printSanJiao(7,20,"*");
//        int[] a = new int[]{53, 123, 123, 3, 4, 5, 3, 6, 2, 423};
//        bubbleSort(a);
//        for (int i : a) {
//            System.out.print(i + " ");
//        }
        while (true)
        s();
    }

    public static int getPrint() {
        int i = new Scanner(System.in).nextInt();
        if (i >= 0 && i <= 9) {
            return i;
        } else {
            System.out.println("输入不合法 ， 请重新输入");
        }
        return getPrint();
    }

    public static int count(int i) {
        int ans = 0;
        while (i != 0) {
            i /= 10;
            ans++;
        }
        return ans;
    }

    public static int countN(int n, int minNum, int maxNum) {
        int count = 0;
        for (int i = minNum; i < maxNum; i++) {
            if (i % n == 0 || (i % 10 == n || i / 10 == n)) {
                System.out.print("过 ");
                count++;
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        return count;
    }

    public static void printSanJiao(int row, int padding, String str) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i + padding - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }

    public static void bubbleSort(int[] a) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
    private static void s () {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(hexString(i));
        int i1 = i >> 2;
        System.out.println(hexString(i1));
        System.out.println(i1);
    }
    private static String hexString(int i ) {
        StringBuilder sb = new StringBuilder();
        int q = 32;
        while (q -- > 0 ) {
            sb.append(i&1);
            i = i >> 1;
        }
        return sb.reverse().toString();
    }

}


