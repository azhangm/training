package day01.Price;

import java.util.Scanner;

public class PriceThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if ((num & 1 ) == 0 ) {
            System.out.println("您输入的是一个偶数");
        } else {
            System.out.println("您输入的是一个奇数");
        }
    }
}
