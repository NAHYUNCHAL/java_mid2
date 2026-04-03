package tutor.d4_03;

import java.util.Objects;

public class Member {
    private String memberId;

    public Member(String memberId) {
        this.memberId = memberId;
    }



    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Member member)) return false;
        return Objects.equals(memberId, member.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(memberId);
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                '}';
    }
}
