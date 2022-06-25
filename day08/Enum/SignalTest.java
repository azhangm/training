package day08.Enum;

import java.util.Scanner;

public class SignalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        Signal signal = Signal.GREEN;
        switch (signal) {
            case RED :
            case GREEN:
            case YELLOW :
                signal.prompt();
                        break;
        }
    }
}
