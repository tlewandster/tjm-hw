package pl.tlewandster.task12;

public class Exercise_12 {
    static void main() {
        TriFunction<Double, Double, Double, Double> weightedAverage = (grade, weight, maxWeight) -> grade * weight / maxWeight;

        double[] grades = {3.0, 4.5, 5.0};
        double[] weights = {1.0, 2.0, 3.0};

        double maxWeight = 0;
        for (double weight : weights) {
            maxWeight += weight;
        }

        double overallWeightAverage = 0;
        for (int i = 0; i < grades.length; i++) {
            overallWeightAverage += weightedAverage.apply(grades[i], weights[i], maxWeight);
        }

        System.out.println(overallWeightAverage);
    }

    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
}



