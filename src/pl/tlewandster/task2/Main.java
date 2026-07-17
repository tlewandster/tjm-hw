package pl.tlewandster.task2;

import java.util.Scanner;

public class Main {
    static void main() {
        final String SET_GREEN_FONT = "\u001B[32m";
        final String RESET_FONT_COLOR = "\u001B[0m";

        System.out.println(SET_GREEN_FONT + "1. Liczby od 1 do 10" + RESET_FONT_COLOR);
        printNums1To10();
    }


    private static void askRepeat(Runnable action) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPowtórzyć [t/n] ?");
        if (scanner.nextLine().equals("t")) {
            action.run();
        }
    }

    private static void printNums1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        askRepeat(Main::printNums1To10);
    }


}
