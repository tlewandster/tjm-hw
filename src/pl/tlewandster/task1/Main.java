package pl.tlewandster.task1;

import java.util.Scanner;

public class Main {
    static void main() {
        final String SET_GREEN_FONT = "\u001B[32m";
        final String RESET_FONT_COLOR = "\u001B[0m";

        System.out.println(SET_GREEN_FONT + "1. Wiek i pełnoletność" + RESET_FONT_COLOR);
        verifyAge();
        System.out.println(SET_GREEN_FONT + "2. Parzystość liczby" + RESET_FONT_COLOR);
        checkNumberEvenness();
        System.out.println(SET_GREEN_FONT + "3. Kategoryzacja wieku" + RESET_FONT_COLOR);
        categorizeByAge();
        System.out.println(SET_GREEN_FONT + "4. Ocena temperatury" + RESET_FONT_COLOR);
        rateTemperature();
    }

    private static void verifyAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek użytkownika: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Nie jesteś pełnoletni");
        }
        askRepeat(Main::verifyAge);
    }

    private static void askRepeat(Runnable action) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Powtórzyć [t/n] ?");
        if (scanner.nextLine().equals("t")) {
            action.run();
        }
    }

    private static void checkNumberEvenness() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " to liczba parzysta");
        } else {
            System.out.println(num + " to liczba nieparzysta");
        }
        askRepeat(Main::checkNumberEvenness);
    }

    private static void categorizeByAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();
        if (age < 12) {
            System.out.println("Dziecko");
        } else if (age <= 17) {
            System.out.println("Nastolatek");
        } else if (age <= 64) {
            System.out.println("Dorosły");
        } else {
            System.out.println("Senior");
        }
        askRepeat(Main::categorizeByAge);
    }

    private static void rateTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę w st. Celsiusza: ");
        int temperature = scanner.nextInt();
        if (temperature < 0) {
            System.out.println("Mróz");
        } else if (temperature <= 15) {
            System.out.println("Chłodno");
        } else if (temperature <= 25) {
            System.out.println("Ciepło");
        } else {
            System.out.println("Gorąco");
        }
        askRepeat(Main::rateTemperature);
    }

}
