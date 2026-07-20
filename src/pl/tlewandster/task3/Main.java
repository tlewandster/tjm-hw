package pl.tlewandster.task3;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("JavaPrintToLogpoint")

public class Main {
    static void main() {
        final String SET_GREEN_FONT = "\u001B[32m";
        final String RESET_FONT_COLOR = "\u001B[0m";

        System.out.println(SET_GREEN_FONT + "1. The first array of numbers" + RESET_FONT_COLOR);
        createArray();
        System.out.println(SET_GREEN_FONT + "2. Array of names" + RESET_FONT_COLOR);
        printNames();
        System.out.println(SET_GREEN_FONT + "3. Array of values from 1 to n" + RESET_FONT_COLOR);
        createArray1ToN();
        System.out.println(SET_GREEN_FONT + "4. Sum of elements in array" + RESET_FONT_COLOR);
        sumElements();
        System.out.println(SET_GREEN_FONT + "5. Average of elements in array" + RESET_FONT_COLOR);
        avgElements();
        System.out.println(SET_GREEN_FONT + "6. Largest element of array" + RESET_FONT_COLOR);
        maxValue();
    }

    private static void askRepeat(Runnable action) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nRepeat [y/n] ?");
        if (scanner.nextLine().equals("y")) {
            action.run();
        }
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static int[] getRandomIntArray(int length) {
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        return nums;
    }

    private static void createArray() {
        int[] nums = getRandomIntArray(5);
        printArray(nums);
        askRepeat(Main::createArray);
    }

    private static void printNames() {
        String[] names = {"Arek", "Marek", "Czarek"};
        for (String name : names) {
            System.out.println("Hi, " + name + "!");
        }
        askRepeat(Main::printNames);
    }

    private static void createArray1ToN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length: ");
        int length = scanner.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        printArray(nums);
        askRepeat(Main::createArray1ToN);
    }

    private static void sumElements() {
        int[] nums = getRandomIntArray(3);
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("Array:");
        printArray(nums);
        System.out.println("Sum:\n" + sum);
        askRepeat(Main::sumElements);
    }

    private static void avgElements() {
        int[] nums = getRandomIntArray(3);
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double avg = (double) sum / nums.length;
        System.out.println("Array:");
        printArray(nums);
        System.out.println("Average:\n" + avg);
        askRepeat(Main::avgElements);
    }

    private static void maxValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length:");
        int[] nums = getRandomIntArray(scanner.nextInt());
        System.out.println("Array:");
        printArray(nums);
        Arrays.sort(nums);
        System.out.println("Largest number of array: " + nums[nums.length - 1]);
        askRepeat(Main::maxValue);
    }
}
