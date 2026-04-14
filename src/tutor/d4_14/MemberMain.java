package tutor.d4_14;

public class MemberMain {
    public static void main(String[] args) {
        Member member1 = new Member(123,"회원1",1);
        Member member2 = new Member(234,"회원2",1);
        System1 system1 = new System1();

        member1.membership(system1);
        member2.membership(system1);
        member1.updateNumber(system1,1234);

        member1.memberInquiry(system1);
        member2.memberInquiry(system1);

        member1.fullinquiryrequest(system1);
    }
}
