package pl.tlewandster.task11;

import java.util.Objects;

class NestedEntry<K1, K2, V> implements TwoKeyMap.Entry<K1, K2, V>{

    private final K1 key1;
    private final K2 key2;
    private V value;

    public NestedEntry(K1 key1, K2 key2, V value) {
        this.key1 = Objects.requireNonNull(key1, "Key key1 cannot be null");
        this.key2 = Objects.requireNonNull(key2, "Key key2 cannot be null");
        this.value = Objects.requireNonNull(value, "Value cannot be null");
    }

    @Override
    public K1 getKey1() {
        return key1;
    }

    @Override
    public K2 getKey2() {
        return key2;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        Objects.requireNonNull(value, "Value cannot be null");

        this.value = value;
        return value;
    }

}
