package day08.HomeWork;

import java.util.Random;
import java.util.Scanner;

//从键盘输入一段中文，将中文中的  “妈逼“，”傻逼“，”婊子“，”草“等词语替换成”**“
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = replaceSensitiveWords(s);
        System.out.println(s1);
    }

    public static String replaceSensitiveWords(String s) {
        if (s.contains("傻逼")) s = s.replace("傻逼", "**");
        if (s.contains("妈逼")) s = s.replace("妈逼", "**");
        return s;
    }
}