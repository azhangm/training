package day08.HomeWork;

import java.util.Random;
import java.util.Scanner;

//�Ӽ�������һ�����ģ��������е�  ����ơ�����ɵ�ơ�������ӡ������ݡ��ȴ����滻�ɡ�**��
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = replaceSensitiveWords(s);
        System.out.println(s1);
    }

    public static String replaceSensitiveWords(String s) {
        if (s.contains("ɵ��")) s = s.replace("ɵ��", "**");
        if (s.contains("���")) s = s.replace("���", "**");
        return s;
    }
}