package tutor.d3_20.step3;

public class UserStorageMain {
    static void main(String[] args) {
        UserStorage<User> storage = new UserStorage<>();
        System.out.println("처음 상태: " + storage.isEmpty());
        storage.save(new User(1,"kim"));
        System.out.println("id: " +  storage.find().getId());
        System.out.println("name: " +  storage.find().getName());
        System.out.println("저장 후 상태: " + storage.isEmpty());

    }
}
