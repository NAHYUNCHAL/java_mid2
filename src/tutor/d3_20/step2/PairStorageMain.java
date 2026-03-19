package tutor.d3_20.step2;

public class PairStorageMain {
    static void main(String[] args) {
        PairStorage<String, Integer> storage = new PairStorage<>();
        System.out.println("처음 상태: " + storage.isEmpty());
        storage.save("apple",100);
        System.out.println("key1: " + storage.findKey());
        System.out.println("value1: " + storage.findValue());
        System.out.println("저장 후 상태: " + storage.isEmpty());
        PairStorage<Integer,String> storage1 = new PairStorage<>();
        storage1.save(1,"admin");
        System.out.println("key2: " + storage1.findKey());
        System.out.println("value2: " + storage1.findValue());


    }

}
