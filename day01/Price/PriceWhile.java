package day01.Price;

import java.util.Scanner;

public class PriceWhile {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int ans = 0;
        if (num != 0){
        while (num != 0) {
            num /= 10;
            ans ++;
        }
            System.out.println("该数字是" + ans + "位数");
        }else {
            System.out.println("该数字是" + 1 + "位数");
        }

    }
}
