package tutor.d4_14;

import java.util.Objects;

public class Member {
    private Integer memberId;
    private String memberName;
    private int number;

    public Member(int memberId, String memberName, int number) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.number = number;
    }

    public void membership(System1 system1) { //등록 요청
        if (system1.contains(memberId)){
            throw new IllegalArgumentException("등록을 할 수없습니다.");
        } else {
            system1.registration(memberId,this);
        }
    }
    public void memberInquiry(System1 system1) {
        system1.inquiry(memberId);
    }

    public void fullinquiryrequest(System1 system1) {
        system1.fullinquiry();
    }

    public void updateNumber(System1 system1,int number) {
        system1.updatenumber(memberId,number);
    }


    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return memberId == member.memberId && number == member.number && Objects.equals(memberName, member.memberName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, memberName, number);
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", number=" + number +
                '}';
    }
}
