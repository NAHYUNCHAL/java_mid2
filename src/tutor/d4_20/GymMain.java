package tutor.d4_20;

public class GymMain {
    static void main(String[] args) {
        Gym gym = new Gym();
        Member member1 = new Member("회원1");
        Member member2 = new Member("회원2");
        Member member3 = new Member("회원3");
        Member member4 = new Member("회원4");

        gym.registrationCheck(member1);

        gym.registrationCheck(member2);
        gym.registrationCheck(member3);
        gym.registrationCheck(member4);


        gym.inquiryCheck(1);
        gym.inquiryCheck(2);
        gym.inquiryCheck(3);
        gym.deleteCheck(member1);
        gym.inquiryCheck(1);



    }
}
