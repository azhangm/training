package day08.HomeWork;

import java.util.Scanner;

public class TiHuan {
    public static void main(String[] args) {
        replace();
    }

    public static void replace() {
        String[] str1 = {"���", "ɵ��", "���", "��"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("������һ������");
        String print = scanner.nextLine();
        for (int i = 0; i < str1.length; i++) {
            print = print.replace(str1[i], "**");
        }
        System.out.println(print);
    }
}