package tutor.d4_03;

import java.util.Objects;

public class Member1 {
    private String memberId;

    public Member1(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Member1 member1)) return false;
        return Objects.equals(memberId, member1.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(memberId);
    }

    @Override
    public String toString() {
        return "Member1{" +
                "memberId='" + memberId + '\'' +
                '}';
    }
}
