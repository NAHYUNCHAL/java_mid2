package tutor.d3_20.step1;

public class StorageMain {
    static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>();
        System.out.println("빈 저장소1: " + stringStorage.isEmpty());
        stringStorage.save("apple");
        System.out.println("저장값1: " + stringStorage.find());
        System.out.println("빈 저장소2: " + stringStorage.isEmpty());
        Storage<Integer> integerStorage = new Storage<>();
        integerStorage.save(10);
        System.out.println("저장값2: " + integerStorage.find());

    }
}
