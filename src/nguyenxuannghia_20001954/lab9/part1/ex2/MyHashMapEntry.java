package nguyenxuannghia_20001954.lab9.part1.ex2;

public class MyHashMapEntry {

    private final Object key;
    private final Object value;

    MyHashMapEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
