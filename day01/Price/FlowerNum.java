package day01.Price;

import static java.lang.Math.*;

public class FlowerNum {
    public static void main(String[] args) {
        int x = 100;
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("所有的水仙花数 : ");
        for (;x < 1000 ; x ++) {
            a = x / 100;
            b = x % 10;
            c = (x % 100) / 10;
            if (x == pow(a,3) + pow(b,3) + pow(c,3)) {
                System.out.println(x);
            }
        }
    }
}
