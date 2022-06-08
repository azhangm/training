package day01.Price;

import java.util.Scanner;

public class PriceTwo {
    public static void main(String[] args) {
        int num = 23;
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        if (a > 23) {
            num = a;
        }
        else {
            num = 23;
        }
        System.out.println(num);
    }
}
