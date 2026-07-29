package pl.tlewandster.task6;

public enum Calculation {
    ADD {
        @Override
        double calculate(int a, int b) {
            return a + b;
        }
    }, SUBTRACT {
        @Override
        double calculate(int a, int b) {
            return a - b;
        }
    }, MULTIPLY {
        @Override
        double calculate(int a, int b) {
            return a * b;
        }
    }, DIVIDE {
        @Override
        double calculate(int a, int b) {
            return (double) a / b;
        }
    };

    abstract double calculate(int a, int b);


}
