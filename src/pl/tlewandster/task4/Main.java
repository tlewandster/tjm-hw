package pl.tlewandster.task4;

import java.util.Arrays;

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
        System.out.printf("%d * %d = %d%n", firstNumberToBeMultiplied, secondNumberToBeMultiplied, multi(firstNumberToBeMultiplied, secondNumberToBeMultiplied));

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

        // 8. Silnia iteracyjnie
        int n = 10;
        System.out.printf("%d! = %d (iteration) %n", n, factorialIter(n));

        // 9. Silnia rekurencyjnie
        System.out.printf("%d! = %d (recurrence) %n", n, factorialIter(n));

        // 10. Suma elementów tablicy
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.printf("Sum of %s = %d %n", Arrays.toString(numbers), sumArray(numbers));

        // 11. Największy element tablicy
        numbers = new int[]{20, 55, 60, 84, 65, 6, 60, 51, 33, 14};
        System.out.printf("Max of %s = %d %n", Arrays.toString(numbers), maxArray(numbers));
        numbers = new int[]{48, 8, 54, 12, 52, 55, 47, 45, 22, 72};
        System.out.printf("Max of %s = %d %n", Arrays.toString(numbers), maxArray(numbers));
        numbers = new int[]{12, 12, 95, 95, 51, 33, 21, 93, 60, 35};
        System.out.printf("Max of %s = %d %n", Arrays.toString(numbers), maxArray(numbers));

        // 12. Czy liczba jest pierwsza
        number = 23;
        System.out.printf("%d is %sprime number %n",number, isPrimeNumber(number)?"":"not ");
        number = 24;
        System.out.printf("%d is %sprime number %n",number, isPrimeNumber(number)?"":"not ");

        // 13. Odwrotna kolejność w tablicy
        System.out.printf("Reversed %s = %s %n",Arrays.toString(numbers),Arrays.toString(reverseArray(numbers)));

        // 14. Merge tablicy
        int[] firstNums = {24, 82, 80, 19, 64};
        int[] secondNums = {40, 68, 13, 66, 43};
        System.out.printf("Merged %s + %s = %s %n", Arrays.toString(firstNums), Arrays.toString(secondNums), Arrays.toString(mergeArrays(firstNums, secondNums)));
    }

    static void welcome(String name) {
        System.out.printf("Welcome, %s!%n", name);
    }

    static int multi(int a, int b) {
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

    static int factorialIter(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int factorialRek(int n) {
        if (n == 0) { // przypadek bazowy — koniec schodzenia
            return 1;
        }
        return n * factorialRek(n - 1); // wywołanie rekurencyjne na mniejszym n
    }

    static int sumArray(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    static int maxArray(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int[] reverseArray(int[] arr){
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length-1-i];
        }
        return reversedArray;
    }

    static int[] mergeArrays(int[] firstArr, int[] secondArr){
        int[] mergedArray = Arrays.copyOf(firstArr, firstArr.length+secondArr.length);
        for (int i = firstArr.length; i < mergedArray.length ; i++) {
            mergedArray[i] = secondArr[i-firstArr.length];
        }
        return mergedArray;
    }
}
