package day01.homework;

import java.util.Random;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        int ans = 0;
        int a = new Random().nextInt(30 - 10 + 1 ) + 10 ;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            if (a < num) System.out.println("��²�����ݴ���");
            else if (a > num) System.out.println("��²������С��");
            else System.out.println("��ϲ��¶���");
        }
    }
}
