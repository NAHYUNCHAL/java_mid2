package tutor.d4_14;

import java.util.HashMap;
import java.util.Map;

public class System1 {
    private Map<Integer, Member> map = new HashMap<>();



    public void registration(Integer memberId,Member member) {
        System.out.println(memberId + " 등록 완료");
        map.put(memberId, member);

    }

    public void inquiry(Integer memberId) {
        if(map.containsKey(memberId)) {
            Member member = map.get(memberId);
            System.out.println(member);
        } else {
            throw new IllegalArgumentException("등록 안되어있음");
        }

    }
    public void fullinquiry() {
        System.out.println(map);
    }
    public void updatenumber(Integer memberId,int number) {
        if(map.containsKey(memberId)) {
            Member member = map.get(memberId);
            member.setNumber(number);

        } else {
            throw new IllegalArgumentException("수정불가");
        }



    }



    public boolean contains(Integer memberId) {
        return map.containsKey(memberId);
    }

}
