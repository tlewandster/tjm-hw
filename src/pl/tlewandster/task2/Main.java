package pl.tlewandster.task2;

import java.util.Scanner;

@SuppressWarnings({"ManualMinMaxCalculation", "JavaPrintToLogpoint"})

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
        System.out.println(SET_GREEN_FONT + "9. Tabela mnożenia dla liczby" + RESET_FONT_COLOR);
        createMultiplicationTable();
        System.out.println(SET_GREEN_FONT + "10. Break – pierwsza liczba podzielna przez 7" + RESET_FONT_COLOR);
        findFirstNumDivisibleBy7();
        System.out.println(SET_GREEN_FONT + "11. Continue – pomijanie parzystych" + RESET_FONT_COLOR);
        skipEvenNumbers();
        System.out.println(SET_GREEN_FONT + "12. Suma liczb dodatnich" + RESET_FONT_COLOR);
        sumPositive();
        System.out.println(SET_GREEN_FONT + "13. Licznik prób logowania" + RESET_FONT_COLOR);
        countLoginAttempt();
        System.out.println(SET_GREEN_FONT + "14. Liczby podzielne przez 3 lub 5 w przedziale" + RESET_FONT_COLOR);
        findNumbersDivisibleBy3Or5();
        System.out.println(SET_GREEN_FONT + "15. Obliczanie silni" + RESET_FONT_COLOR);
        calcFactorial();
        System.out.println(SET_GREEN_FONT + "16. Liczba cyfr w liczbie" + RESET_FONT_COLOR);
        calcNums();
        System.out.println(SET_GREEN_FONT + "17. Podnoszenie do potęgi" + RESET_FONT_COLOR);
        calcPower();
        System.out.println(SET_GREEN_FONT + "18. Znajdowanie największej liczby" + RESET_FONT_COLOR);
        findGreatestNum();
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

    private static void createMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
        askRepeat(Main::createMultiplicationTable);
    }

    private static void findFirstNumDivisibleBy7() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n + 1; ; i++) {
            if (i % 7 == 0) {
                System.out.printf("Pierwsza liczba większa od %d podzielna przez 7 to %d", n, i);
                break;
            }
        }
        askRepeat(Main::findFirstNumDivisibleBy7);
    }

    private static void skipEvenNumbers() {
        int num = 0;
        while (++num <= 20) {
            System.out.print(num % 2 != 0 ? num : " ");
        }
        askRepeat(Main::skipEvenNumbers);
    }

    private static void sumPositive() {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int num;
        do {
            num = scanner.nextInt();
            result += num > 0 ? num : 0;
        } while (num != 0);
        System.out.println("suma wprowadzonych liczb dodatnich: " + result);
        askRepeat(Main::sumPositive);
    }

    private static void countLoginAttempt() {
        final String login = "Jaś";
        final String pass = "Kunefał";
        int loginAttempt = 0;
        boolean isAllowed = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Login: ");
            String userLogin = scanner.nextLine();
            System.out.print("Hasło: ");
            String userPass = scanner.nextLine();
            if (userLogin.equals(login) && userPass.equals(pass)) {
                isAllowed = true;
                break;
            }
            System.out.println("Nieprawidłowe dane.");
        } while (++loginAttempt < 3);
        System.out.println(isAllowed ? "Zalogowano" : "Dostęp zablokowany!");
        askRepeat(Main::countLoginAttempt);
    }

    private static void findNumbersDivisibleBy3Or5() {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++) {
            System.out.print(i % 3 == 0 || i % 5 == 0 ? i + " " : "");
        }
        askRepeat(Main::findNumbersDivisibleBy3Or5);
    }

    private static void calcFactorial() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
        askRepeat(Main::calcFactorial);
    }

    private static void calcNums() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            n = scanner.nextInt();
        } while (n < 0);
        int i = 0;
        while (n > 0) {
            n /= 10;
            i++;
        }
        System.out.println(i);
        askRepeat(Main::calcNums);
    }

    private static void calcPower() {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        do {
            m = scanner.nextInt();
        } while (m < 0);
        int result = n;
        for (int i = 1; i < m; i++) {
            result *= n;
        }
        System.out.println(result);
        askRepeat(Main::calcPower);
    }

    private static void findGreatestNum() {
        Scanner scanner = new Scanner(System.in);
        int num;
        int max = 0;
        do {
            num = scanner.nextInt();
            max = num > max ? num : max;
        } while (num != 0);
        System.out.println(max);
        askRepeat(Main::findGreatestNum);
    }

}
