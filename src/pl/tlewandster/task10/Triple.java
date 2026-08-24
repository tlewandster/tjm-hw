package pl.tlewandster.task10;

import java.util.Objects;

public final class Triple<T, U, V> {
    private final T first;
    private final U second;
    private final V third;

    private Triple(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static <T, U, V> Triple<T, U, V> of(T first, U second, V third) {
        return new Triple<>(first, second, third);
    }

    public T first() {
        return this.first;
    }

    public U second() {
        return this.second;
    }

    public V third() {
        return this.third;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Triple<?, ?, ?> triple)) return false;

        return Objects.equals(first, triple.first) && Objects.equals(second, triple.second) && Objects.equals(third, triple.third);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(first);
        result = 31 * result + Objects.hashCode(second);
        result = 31 * result + Objects.hashCode(third);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Triple[first = %s, second = %s, third = %s]", this.first, this.second, this.third);
    }
}
