package pl.tlewandster.task10;

public final class Pair<T, U> {
    private final T first;
    private final U second;

    private Pair(T first, U second) { /* ... */ }

    public static <T, U> Pair<T, U> of(T first, U second) { /* ... */ }

    public T first() { /* ... */ }
    public U second() { /* ... */ }

    @Override public boolean equals(Object o) { /* zgodne z kontraktem */ }
    @Override public int hashCode() { /* zgodne z equals */ }
    @Override public String toString() { /* np. "Pair[first=..., second=...]" */ }
}