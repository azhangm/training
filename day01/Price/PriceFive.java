package day01.Price;

import java.util.Scanner;

//if ��ʽ 3
public class PriceFive {
    public static void main(String[] args) {
        int score = new Scanner(System.in).nextInt();
        if (score == 100) {
            System.out.println("����һ��ң�طɻ�");
        } else if (score >= 90 && score <= 99) {
            System.out.println("��������һ�����ֳ�");
        } else if (score >= 80 && score <= 89) {
            System.out.println("������߳�һ��");
        } else if (score >= 70 && score <= 79 ) {
            System.out.println("�������ֻ�30����");
        } else {
            System.out.println("����һ��");
        }
    }
}
