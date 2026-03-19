package tutor.d3_20.step2;

public class PairStorage<K, V> {
    private K key;
    private V value;

    void save(K key, V value) {
        this.key = key;
        this.value = value;

    }
    K findKey() {
        return key;
    }

    V findValue() {
        return value;
    }
    boolean isEmpty() {
        return key == null && value == null;
    }
}
