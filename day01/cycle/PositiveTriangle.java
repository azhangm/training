package day01.cycle;

public class PositiveTriangle {

    public static void main(String[] args) {
        for (int i = 0 ; i < 4 ; i ++) {
            for (int j = 0; j < 4 - i + 5; j ++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*i + 1 ; j ++) {
                System.out.print("2");
            }
            System.out.println();
        }

    }
}
