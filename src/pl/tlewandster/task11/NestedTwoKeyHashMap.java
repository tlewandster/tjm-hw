package pl.tlewandster.task11;

import pl.tlewandster.task10.Pair;

import java.util.*;

public class NestedTwoKeyHashMap<K1, K2, V> implements TwoKeyMap<K1, K2, V> {

    private final Map<K1, Map<K2, V>> outerMap = new HashMap<>();
    private final Map<K2, V> innerMap = new HashMap<>();


    @Override
    public V put(K1 k1, K2 k2, V value) {
        innerMap.put(k2, value);
        outerMap.put(k1, innerMap);
        return value;
    }

    @Override
    public V get(K1 k1, K2 k2) {
        return null;
    }

    @Override
    public V remove(K1 k1, K2 k2) {
        return null;
    }

    @Override
    public boolean containsKeys(K1 k1, K2 k2) {
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
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
        return outerMap.toString();
    }
}
