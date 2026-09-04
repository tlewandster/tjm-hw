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

    public static <T> int indexOf(T[] arr, T value) {
        // pierwszy indeks wystąpienia; brak → -1
        for (int i = 0; i < arr.length; i++) {
            if (value == null) {
                if (arr[i] == null) {
                    return i;
                }
            } else {
                if (value.equals(arr[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static <T> int lastIndexOf(T[] arr, T value) {
        // ostatni indeks wystąpienia; brak → -1
        for (int i = arr.length - 1; i >= 0; i--) {
            if (value == null) {
                if (arr[i] == null) {
                    return i;
                }
            } else {
                if (arr[i].equals(value)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static <T> boolean arraysEqual(T[] firstArray, T[] secondArray) {
        // true jeśli: ten sam rozmiar i każdy element pary firstArr[i] oraz secondArray[i] jest równy (== dla null, equals dla nie-null)
        if (firstArray == null && secondArray == null) return true;
        if (!(firstArray != null && secondArray != null)) return false;
        if (firstArray.length != secondArray.length) return false;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == null) {
                if (secondArray[i] != null) return false;
            } else {
                if (!(firstArray[i].equals(secondArray[i]))) return false;
            }
        }
        return true;
    }
}
