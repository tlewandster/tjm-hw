package pl.tlewandster.task10;

public final class ArrayUtils {
    private ArrayUtils() {
    }

    private static <T> boolean isOutOfBounds(T[] arr, int i) {
        return i < 0 || i >= arr.length;
    }

    public static <T> void swap(T[] arr, int i, int j) {
        if (arr == null) {
            throw new NullPointerException();
        }
        if (isOutOfBounds(arr, i) || isOutOfBounds(arr, j)) {
            throw new IndexOutOfBoundsException();
        }
        if (i == j) {
            return;
        }
        T valueI = arr[i];
        T valueJ = arr[j];
        arr[i] = valueJ;
        arr[j] = valueI;
    }
}
