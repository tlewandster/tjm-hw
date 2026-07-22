package pl.tlewandster.task4;

@SuppressWarnings("JavaPrintToLogpoint")

public class Main {
    static void main() {
        // 1. Proste powitanie
        welcome("Krzysiu");
        welcome("Rysiu");
        welcome("Zdzisiu");

        // 2. Dodawanie liczb
        int firstNumberToBeMultiplied = 3;
        int secondNumberToBeMultiplied = 5;
        System.out.printf("%d * %d = %d%n", firstNumberToBeMultiplied, secondNumberToBeMultiplied, mult(firstNumberToBeMultiplied, secondNumberToBeMultiplied));


    }

    static void welcome(String name) {
        System.out.printf("Welcome, %s!%n", name);
    }

    static int mult(int a, int b) {
        return a * b;
    }
}
