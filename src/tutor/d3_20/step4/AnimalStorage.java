package tutor.d3_20.step4;

public class AnimalStorage <T> {
    private T item;

    public void save(T item) {
        this.item = item;
    }
    T find() {
        return item;
    }
    boolean isEmpty() {
        return item == null;
    }
}
