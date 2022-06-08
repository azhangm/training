package day01.Price;

import java.util.Scanner;

public class PriceFour {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();

        if (year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
