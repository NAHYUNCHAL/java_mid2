package tutor.d3_20.step3;

public class UserStorage <T>{
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
