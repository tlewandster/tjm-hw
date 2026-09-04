package pl.tlewandster.task12;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Exercise_4 {
    private static final BiFunction<Integer, Integer, Integer> mul = (a, b) -> a * b;
    private static final BiFunction<Integer, Integer, Integer> sub = (a, b) -> a - b;
    private static final BiFunction<Integer, Integer, Integer> div = (a, b) -> a / b;
    private static final BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("b = ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.print("function [+ - * /]: ");
        String functionSign = scanner.nextLine();
        int result = switch (functionSign) {
            case "+" -> calculate(a, b, add);
            case "-" -> calculate(a, b, sub);
            case "*" -> calculate(a, b, mul);
            case "/" -> calculate(a, b, div);
            default -> throw new IllegalStateException("Unexpected value: " + functionSign);
        };
        System.out.println("result: " + result);
    }

    static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> op) {
        return op.apply(a, b);
    }
}
