package pl.tlewandster.task12;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class Exercise_7 {
    static void main() {
        BiPredicate<String, String> sameIgnoreCase = String::equalsIgnoreCase;
        BiPredicate<String, String> isSuffix = String::endsWith;
        Scanner scanner = new Scanner(System.in);
        System.out.print("String 1: ");
        String string1 = scanner.nextLine();
        System.out.print("String 2: ");
        String string2 = scanner.nextLine();
        System.out.println("sameIgnoreCase = " + sameIgnoreCase.test(string1,string2));
        System.out.println("isSuffix = " + isSuffix.test(string1,string2));
    }
}

