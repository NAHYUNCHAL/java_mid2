package tutor.d4_16;

import java.util.Objects;

public class Employee_card {
    private int memberNub;
    private String name;

    public Employee_card(int memberNub, String name) {
        this.memberNub = memberNub;
        this.name = name;
    }

    public int getMemberNub() {
        return memberNub;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee_card{" +
                "memberNub=" + memberNub +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Employee_card card)) return false;
        return memberNub == card.memberNub && Objects.equals(name, card.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberNub, name);
    }
}
