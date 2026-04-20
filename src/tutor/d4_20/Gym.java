package tutor.d4_20;

import java.util.*;

public class Gym {
    private Map<Integer,Member> map = new HashMap<>();//회원정보 보관소
    private Integer count = 1;

    public void registrationCheck(Member member) {
        if (contains1(member)) {
            throw new IllegalArgumentException("이미 등록된 사용자는 재등록 할수없습니다.");
        } else {
            map.put(count,member);
            member.registration(count);
            count++;
            System.out.println(member.getName() + "님 회원가입 되었습니다.");
        }
    }
    public void inquiryCheck(Integer num) {
        if (num == null) {
            throw new NullPointerException("회원번호는 null일 수 없습니다.");
        }
        if (!map.containsKey(num)) {
            throw new IllegalArgumentException("등록되지 않은 회원번호입니다.");
        }

        System.out.println(map.get(num));
    }

    public void deleteCheck(Member member) {
        if (member == null) {
            throw new NullPointerException("null 들어오면 안된다.");
        }
        if (contains1(member) ) {
            int i = member.comparisonNumber();
            map.remove(i);
            System.out.println(member.getName() + "님 회원정보 삭제되었습니다.");

        } else {
            throw new IllegalArgumentException("등록된 정보가 없습니다");
        }
    }



    private boolean contains1(Member member) {
        return map.containsValue(member);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Gym gym)) return false;
        return Objects.equals(map, gym.map) && Objects.equals(count, gym.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map, count);
    }

    @Override
    public String toString() {
        return "Gym{" +
                "count=" + count +
                ", list=" + map +
                '}';
    }
}
