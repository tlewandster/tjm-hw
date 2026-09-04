package pl.tlewandster.task12;

import java.util.Arrays;
import java.util.function.Supplier;

public class Exercise_11 {
    @FunctionalInterface
    interface StringFormatter {
        String format(String input);
    }

    static void main() {
        StringFormatter toUppercase = String::toUpperCase;
        StringFormatter addPrefix = ">>> "::concat;
        StringFormatter reverseString = s-> new StringBuilder(s).reverse().toString();

        System.out.println(applyFormat("Java",toUppercase));
        System.out.println(applyFormat("Java",addPrefix));
        System.out.println(applyFormat("Java",reverseString));
    }

    static String applyFormat(String text, StringFormatter formatter){
        return formatter.format(text);
    }
}



