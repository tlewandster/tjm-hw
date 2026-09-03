package pl.tlewandster.task12;

import java.util.Scanner;
import java.util.function.Function;

public class Exercise_3 {
    static void main() {
        Function<String, Integer> lengthWithoutSpaces = s -> s.replace(" ", "").length();
        Function<String,Integer> numberVowels = s-> s.replaceAll("(?i)[^aeiouy]", "").length();
        System.out.println("Enter sentence:");
        String string = new Scanner(System.in).nextLine();
        System.out.println("Length without spaces: " + lengthWithoutSpaces.apply(string));
        System.out.println("Number of vowels: " + numberVowels.apply(string));
    }
}
