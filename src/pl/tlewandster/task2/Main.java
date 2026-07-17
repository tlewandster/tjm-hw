package pl.tlewandster.task2;

import java.util.Scanner;

public class Main {
    static void main() {
        final String SET_GREEN_FONT = "\u001B[32m";
        final String RESET_FONT_COLOR = "\u001B[0m";

        System.out.println(SET_GREEN_FONT + "1. Liczby od 1 do 10" + RESET_FONT_COLOR);
        printNums1To10();
        System.out.println(SET_GREEN_FONT + "2. Liczby parzyste w zakresie" + RESET_FONT_COLOR);
        printRangeOfEven();
        System.out.println(SET_GREEN_FONT + "3. Suma liczb od 1 do n" + RESET_FONT_COLOR);
        sumRange();
        System.out.println(SET_GREEN_FONT + "4. Odwrotne liczenie" + RESET_FONT_COLOR);
        printReverse();
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

    private static void printRangeOfEven() {
        Scanner scanner = new Scanner(System.in);
        int to = scanner.nextInt();
        for (int i = 0; i <= to; i++) {
            System.out.print(i % 2 == 0 ? i : " ");
        }
        askRepeat(Main::printRangeOfEven);
    }

    private static void  sumRange(){
        Scanner scanner = new Scanner(System.in);
        int to = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= to; i++) {
            result += i;
        }
        System.out.printf("Suma cyfr od 1 do %d to %d",to, result);
        askRepeat(Main::sumRange);
    }

    private static void  printReverse(){
        for (int i = 10; i >0 ; i--) {
            System.out.print(i + " ");
        }
        askRepeat(Main::printReverse);
    }
}
