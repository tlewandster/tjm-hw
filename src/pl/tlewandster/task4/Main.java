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

        // 3. Porównanie liczb
        int firstNumToCompare = 3;
        int secondNumToCompare = 5;
        System.out.printf("Number %d is greater%n", max(firstNumToCompare, secondNumToCompare));

        // 4. Parzystość liczby
        int number = 3;
        System.out.printf("Number %d is %s %n", number, isEven(number) ? "even" : "odd");

        // 5. Średnia trzech liczb
        double firstNumToAvg = 3;
        double secondNumToAvg = 5;
        double thirdNumToAvg = 8;
        System.out.printf("%f, %f, %f average is %.2f %n", firstNumToAvg, secondNumToAvg, thirdNumToAvg, average(firstNumToAvg, secondNumToAvg, thirdNumToAvg));

        // 6. Kategoria wiekowa
        int age = 52;
        System.out.printf("Age category for %d years old is %s %n", age, ageCategory(age));

        // 7. Zasięg zmiennych
        int x = 5;
        changeX(x);
        System.out.printf("x into main scope = %d %n", x);

    }

    static void welcome(String name) {
        System.out.printf("Welcome, %s!%n", name);
    }

    static int mult(int a, int b) {
        return a * b;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    static String ageCategory(int age) {
        if (age < 12) {
            return "Child";
        } else if (age <= 17) {
            return "Teenager";
        } else if (age <= 64) {
            return "Adult";
        } else return "Senior";
    }

    static void changeX(int x) {
        x *= 2;
        System.out.printf("x into method scope = %d %n", x);
    }
}
