package tutor.d4_13;

public class UserMain {
    static void main(String[] args) {
        User user1 = new User("회원1",Rating.NORMAL);
        User user2 = new User("회원2",Rating.NORMAL);
        User user3 = new User("회원3",Rating.VIP);

        System1 system1 = new System1();
        user1.registration(system1);
        user2.registration(system1);
        user3.registration(system1);

        user1.inquiry(system1);

        user1.entire(system1);




    }
}
