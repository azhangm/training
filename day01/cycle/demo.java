package day01.cycle;

public class demo {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0 ; i < 100 ; i ++) {
            System.out.print(i + "\t");
            count ++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }
}
