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
    }

    private static void askRepeat(Runnable action) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nRepeat [y/n] ?");
        if (scanner.nextLine().equals("y")) {
            action.run();
        }
    }

    private static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    private static int[] getRandomIntArray(int length){
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = (int) (Math.random()*100);
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
}
