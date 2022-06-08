package day01.homework;

public class Three {
    public static void main(String[] args) {
        int total = 1000000000;
        int ans  = 0;
        while (total != 0) {
            total >>= 1 ;
            ans ++;
        }
        System.out.println("我要" + ans + "天花完");
    }
}
