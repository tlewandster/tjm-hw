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

        V oldValue = null;
        for (Entry<K1,K2,V> entry : entrySet()) {
            if (entry.getKey1().equals(key1) && entry.getKey2().equals(key2)) {
                oldValue = entry.getValue();
            }
        }
        HashMap<K2, V> innerMap = new HashMap<>();
        innerMap.put(key2, value);
        map.put(key1, innerMap);
        return oldValue;
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
        Set<Entry<K1, K2, V>> nestedEntries = new HashSet<>();
        for (Map.Entry<K1, Map<K2, V>> mapEntry : map.entrySet()) {
            K1 key1 = mapEntry.getKey();
            for (Map.Entry<K2, V> innerMapEntry : mapEntry.getValue().entrySet()) {
                K2 key2 = innerMapEntry.getKey();
                V value = innerMapEntry.getValue();
                nestedEntries.add(new NestedEntry<>(key1, key2, value));
            }
        }
        return nestedEntries;
    }

    @Override
    public Set<Pair<K1, K2>> keySet() { //typ Pair z tasku 10
        Set<Pair<K1, K2>> keys = new HashSet<>();
        for (Map.Entry<K1, Map<K2, V>> mapEntry : map.entrySet()) {
            K1 key1 = mapEntry.getKey();
            for (Map.Entry<K2, V> innerEntry : mapEntry.getValue().entrySet()) {
                K2 key2 = innerEntry.getKey();
                keys.add(new Pair<>(key1, key2));
            }
        }
        return keys;
    }

    @Override
    public Collection<V> values() {
        List<V> values = new ArrayList<>();
        for (Map<K2, V> innerMap : map.values()) {
            values.addAll(innerMap.values());
        }
        return values;
    }

    @Override
    public void putAll(TwoKeyMap<? extends K1, ? extends K2, ? extends V> other) {
        Objects.requireNonNull(other, "Other map cannot be null");

        for (Entry<? extends K1, ? extends K2, ? extends V> otherEntry : other) {
            put(otherEntry.getKey1(), otherEntry.getKey2(), otherEntry.getValue());
        }
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Map<K2, V> row(K1 key1) {
        Objects.requireNonNull(key1, "Key key1 cannot be null");

        return map.get(key1);
    }

    @Override
    public Map<K1, V> column(K2 key2) {
        Objects.requireNonNull(key2, "Key key2 cannot be null");

        Map<K1, V> columnsMap = new HashMap<>();
        for (Entry<K1, K2, V> entry : entrySet()) {
            if (entry.getKey2().equals(key2)) {
                columnsMap.put(entry.getKey1(), entry.getValue());
            }
        }
        return columnsMap;
    }

    @Override
    public Iterator<Entry<K1, K2, V>> iterator() {
        return entrySet().iterator();
    }

    @Override
    public String toString() {
        return entrySet().toString();
    }
}
