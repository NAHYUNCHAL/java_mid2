package tutor.d4_20;

import java.util.Objects;

public class Member { //회원정보
    private int number;
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public void registration(int number) {
        this.number = number;
    }

    public int comparisonNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", number=" + number + "번 회원입니다" +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Member member)) return false;
        return Objects.equals(number, member.number) && Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}
