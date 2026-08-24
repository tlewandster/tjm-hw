package pl.tlewandster.task10;

public final class MinMax {
    private MinMax() {
    }

    public static <T extends Comparable<? super T>> Pair<T, T> minMax(T[] arr) {
        // zwróć parę (min, max); pusta tablica → IllegalArgumentException
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("An array cannot be null or empty");
        }
        ;
        T max = arr[0];
        T min = arr[0];
        for (T element : arr) {
            if (element == null) {
                throw new IllegalArgumentException("An element of array cannot be null");
            }
            if (element.compareTo(min) < 0) {
                min = element;
            }
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return new Pair<>(min, max);
    }
}