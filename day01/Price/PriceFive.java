package day01.Price;

import java.util.Scanner;

//if 格式 3
public class PriceFive {
    public static void main(String[] args) {
        int score = new Scanner(System.in).nextInt();
        if (score == 100) {
            System.out.println("奖励一架遥控飞机");
        } else if (score >= 90 && score <= 99) {
            System.out.println("奖励游玩一次游乐场");
        } else if (score >= 80 && score <= 89) {
            System.out.println("奖励玩具车一辆");
        } else if (score >= 70 && score <= 79 ) {
            System.out.println("奖励玩手机30分钟");
        } else {
            System.out.println("挨揍一顿");
        }
    }
}
