package pl.tlewandster.task11;

import pl.tlewandster.task10.Pair;

import java.util.*;

public class NestedTwoKeyHashMap<K1, K2, V> implements TwoKeyMap<K1, K2, V> {

    private final Map<K1, Map<K2, V>> map = new HashMap<>();


    @Override
    public V put(K1 key1, K2 key2, V value) {
        Objects.requireNonNull(key1, "Key key1 cannot be null");
        Objects.requireNonNull(key2, "Key key2 cannot be null");
        Objects.requireNonNull(value, "Value cannot be null");

        HashMap<K2, V> innerMap = new HashMap<>();
        innerMap.put(key2, value);
        map.put(key1, innerMap);
        return value;
    }

    @Override
    public V get(K1 key1, K2 key2) {
        Objects.requireNonNull(key1, "Key key1 cannot be null");
        Objects.requireNonNull(key2, "Key key2 cannot be null");

        return map.get(key1).get(key2);
    }

    @Override
    public V remove(K1 key1, K2 key2) {
        Objects.requireNonNull(key1, "Key key1 cannot be null");
        Objects.requireNonNull(key2, "Key key2 cannot be null");

        return map.get(key1).remove(key2);
    }

    @Override
    public boolean containsKeys(K1 key1, K2 key2) {
        Objects.requireNonNull(key1, "Key key1 cannot be null");
        Objects.requireNonNull(key2, "Key key2 cannot be null");

        return map.get(key1).containsKey(key2);
    }

    @Override
    public boolean containsValue(V value) {
        Objects.requireNonNull(value, "Value cannot be null");

        return map.values().stream().anyMatch(innerMap -> innerMap.containsValue(value));
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public Set<Entry<K1, K2, V>> entrySet() {
        return Set.of();
    }

    @Override
    public Set<Pair<K1, K2>> keySet() {
        return Set.of();
    }

    @Override
    public Collection<V> values() {
        return List.of();
    }

    @Override
    public void putAll(TwoKeyMap<? extends K1, ? extends K2, ? extends V> other) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Map<K2, V> row(K1 k1) {
        return Map.of();
    }

    @Override
    public Map<K1, V> column(K2 k2) {
        return Map.of();
    }

    @Override
    public Iterator<Entry<K1, K2, V>> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
