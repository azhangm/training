package day01.Price;

import java.util.Scanner;

public class PriceOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            System.out.println("a > b");
        }if (a > c) {
            System.out.println("a > c");
        }
    }

}
