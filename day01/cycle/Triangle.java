package day01.cycle;

public class Triangle {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= i + 1; j ++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
