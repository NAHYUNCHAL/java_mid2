package tutor.d4_7;

import java.util.*;

public class Cafe {
    private Map<String, Chair> map = new HashMap<>();
    private Set<Chair> chairs = new HashSet<>();

    // 가변 인자(...)를 사용하면 외부에서 나열한 의자들이 '배열'로 들어옵니다.
    public Cafe(Chair... chairArray) {
        // 배열을 Set으로 변환하여 저장합니다.
        for (Chair c : chairArray) {
            this.chairs.add(c);
        }
    }

    // 사용자가 "몇 번" 의자를 쓰고 싶은지 번호(seatNum)를 받아야 합니다.
    public void used(String memberId, int seatNum) {
        // 1. 주머니(Set)에서 해당 번호의 의자를 찾습니다.
        Chair targetChair = null;
        for (Chair c : chairs) {
            if (c.getNum() == seatNum) {
                targetChair = c;
                break;
            }
        }

        // 2. 의자를 찾았고, 사용 가능하다면 저장소(Map)에 등록합니다.
        if (targetChair != null && targetChair.use()) {
            storage(memberId, targetChair);
        } else if (targetChair == null) {
            System.out.println(seatNum + "번 좌석이 존재하지 않습니다.");
        }
    }

    public void finish(String member) {
        if (map.containsKey(member)) {
            Chair chair = map.get(member);
            chair.checkOut();
            map.remove(member);
        } else {
            System.out.println("사용 중인 좌석이 아닙니다.");
        }
    }

    // 내부에서만 쓰는 저장 로직이므로 private이 적절합니다.
    private void storage(String member, Chair chair) {
        map.put(member, chair);
    }
}