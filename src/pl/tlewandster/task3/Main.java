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
    }

    private static void askRepeat(Runnable action) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nRepeat [y/n] ?");
        if (scanner.nextLine().equals("y")) {
            action.run();
        }
    }

    private static void createArray(){
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        askRepeat(Main::createArray);
    }

    private static void printNames(){
        String[] names = {"Arek", "Marek", "Czarek"};
        for (String name : names) {
            System.out.println("Hi, "+ name+ "!");
        }
        askRepeat(Main::printNames);
    }

}
