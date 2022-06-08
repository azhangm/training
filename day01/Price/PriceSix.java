package day01.Price;

import java.util.Scanner;

public class PriceSix {
    public static void main(String[] args) {
        int gl = new Scanner(System.in).nextInt();
        int money = 0;
        if (gl <= 3 && gl > 0) {
            money = 10;
        }else if (gl > 3 && gl < 15) {
            money += (gl - 3) * 2;
        }else {
            money += (gl - 15) * 3;
        }
        System.out.println("³µ·Ñ" + money);
    }
}
