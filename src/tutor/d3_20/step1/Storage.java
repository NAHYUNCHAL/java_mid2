package tutor.d3_20.step1;

public class Storage<T> {
    private T item;

    void save(T item) {
        this.item = item;
    }
    T find() {
        return item;
    }
    boolean isEmpty() {
        return item == null;
    }


}
