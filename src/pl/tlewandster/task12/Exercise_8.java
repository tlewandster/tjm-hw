package pl.tlewandster.task12;

import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Exercise_8 {
    private static final Consumer<String> logger = System.out::println;

    static void main() {

        List<String> lines = List.of("First Line", "Second Line", "Third Line", "Fourth Line");
        printWithNumbers(lines, logger);
    }

    static void printWithNumbers(List<String> lines, Consumer<String> consumer) {
        for (int i = 0; i < lines.size(); i++) {
            System.out.print(i+1 + ") ");
            consumer.accept(lines.get(i));
        }
    }
}

