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
        System.out.println(SET_GREEN_FONT + "5. Pierwsze wystąpienie litery" + RESET_FONT_COLOR);
        findFirstLetter();
        System.out.println(SET_GREEN_FONT + "6. While – odliczanie" + RESET_FONT_COLOR);
        countdown();
        System.out.println(SET_GREEN_FONT + "7. While – zgadywanie hasła" + RESET_FONT_COLOR);
        checkPass();
        System.out.println(SET_GREEN_FONT + "8. Do-while – min. jedna próba" + RESET_FONT_COLOR);
        getPositiveNum();
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

    private static void sumRange() {
        Scanner scanner = new Scanner(System.in);
        int to = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= to; i++) {
            result += i;
        }
        System.out.printf("Suma cyfr od 1 do %d to %d", to, result);
        askRepeat(Main::sumRange);
    }

    private static void printReverse() {
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        askRepeat(Main::printReverse);
    }

    private static void findFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int position = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                position = i + 1;
                break;
            }
        }
        System.out.println(position > 0 ? "Pierwsza litera 'a' na pozycji " + position : "W Wyrazie nie ma litery 'a'.");
        askRepeat(Main::findFirstLetter);
    }

    private static void countdown() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n >= 0) {
            System.out.print(n-- + " ");
        }
        askRepeat(Main::countdown);
    }

    private static void checkPass() {
        Scanner scanner = new Scanner(System.in);
        String pass = "java123";
        boolean isRightPass = false;
        while (!isRightPass) {
            if (scanner.nextLine().equals(pass)) {
                System.out.println("Zalogowano");
                isRightPass = true;
            } else {
                System.out.println("Hasło nieprawidłowe");
            }
        }
        askRepeat(Main::checkPass);
    }

    private static void getPositiveNum() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Podaj liczbę dodatnią:");
            num = scanner.nextInt();
        } while (num <= 0);
        askRepeat(Main::getPositiveNum);
    }
}
