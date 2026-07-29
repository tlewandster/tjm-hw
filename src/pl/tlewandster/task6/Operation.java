package pl.tlewandster.task6;

public enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    double calculate(int a, int b) {
        double result;
        result = switch (this) {
            case ADD -> a + b;
            case SUBTRACT -> a - b;
            case MULTIPLY -> a * b;
            case DIVIDE -> (double) a / b;
        };
        return result;
    }
}
