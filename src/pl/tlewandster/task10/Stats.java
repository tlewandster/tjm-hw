package pl.tlewandster.task10;

import java.util.Arrays;

public final class Stats<T extends Number> {
    private final T[] data;

    public Stats(T[] data) {
        if (data.length == 0) {
            throw new IllegalArgumentException("The array cannot be empty");
        }
        /* przechowaj referencję lub kopię */
        this.data = data.clone();
    }

    public double mean() {
        /* średnia arytmetyczna */
        double sum = Arrays.stream(this.data)
                .mapToDouble(Number::doubleValue)
                .sum();
        return sum / data.length;
    }

    public double variance() {
        /* wariancja populacyjna */
        double mean = this.mean();
        return  Arrays.stream(this.data)
                .mapToDouble(Number::doubleValue)
                .map((el) -> el - mean)
                .map((el) -> el * el)
                .sum() / this.data.length;
    }

    public boolean hasSameMean(Stats<?> other, double eps) {
        /* |m1-m2| <= eps */
        return Math.abs(this.mean()-other.mean())<= eps;
    }
}