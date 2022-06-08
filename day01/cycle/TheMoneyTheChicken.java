package day01.cycle;

public class TheMoneyTheChicken {
    public static void main(String[] args) {
        int money = 100;
        int total  = 100;
        int maxCockSize = 100 / 5;
        int maxHenSize = 100 / 3;
        for (int i = 0; i < maxCockSize ; i ++) {
            for (int j = 0; j < maxHenSize ; j ++) {
               int smallSize = total - i - j;
                if (smallSize % 3 == 0 && i * 5 + j * 3 + smallSize / 3 == money ) {
                    System.out.println("¹«¼¦ " + i + " Ä¸¼¦ " + j + " Ð¡¼¦ " + smallSize);
                }
            }
        }
    }
}
