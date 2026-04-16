package tutor.d4_16;

public class UserMain {
    static void main(String[] args) {
        Employee_card card1 = new Employee_card(1,"회원1");
        Employee_card card2 = new Employee_card(1,"회원2");
        System1 system1 = new System1();
        Operating_system computer = new Computer(system1);

        User user1 = new User(card1);
        User user2 = new User(card2);
        user1.registrationCall(computer);
        user2.registrationCall(computer);
        user1.inquiryCall(computer);
        user1.deleteCall(computer);
        user1.Size_Connection(computer);





    }
}
