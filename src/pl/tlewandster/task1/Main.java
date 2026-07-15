package pl.tlewandster.task1;

import java.util.Scanner;

public class Main {
    static void main() {
        final String SET_GREEN_FONT = "\u001B[32m";
        final String RESET_FONT_COLOR = "\u001B[0m";

        System.out.println(SET_GREEN_FONT + "1. Wiek i pełnoletność" + RESET_FONT_COLOR);
        verifyAge();
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
    }

    }


}
