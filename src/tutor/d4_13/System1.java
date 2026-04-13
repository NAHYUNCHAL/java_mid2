package tutor.d4_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class System1 {

    private List<String> users = new ArrayList<>(); //대기명단


    public void checkList(String memberId,Rating rating) {
        if (contains(memberId)) {
            throw new IllegalArgumentException("이미 등록한 사용자");
        } else {
            if (rating == Rating.VIP) {
                System.out.println("VIP 등록: " + memberId);
                use2(memberId);
            } else {
                System.out.println("사용 등록: " + memberId);
                use1(memberId);
            }


        }

    }
    public void toCheck(String memberId) {
        if (contains(memberId)) {
            int i = indexOf1(memberId);
            System.out.println((i + 1) + "번쨰 대기순위에 있습니다.");
        } else {
            throw new IllegalArgumentException("대기 순위에 없습니다.");

        }
    }
    public void removIndex(String memberId){
        if (contains(memberId)) {
            int i = indexOf1(memberId);
            remove(i);
            System.out.println("대기 삭제합니다.");
        } else {
            throw new IllegalArgumentException("대기순위에 없습니다.");

        }
    }
    public void theEntire() {
            System.out.println(Arrays.toString(users.toArray()));

    }



    public int indexOf1(String memberId) {
        return users.indexOf(memberId);
    }


    public void use1(String memberId) {
        users.add(memberId);
    }
    public void use2(String memberId) {
        users.add(0,memberId);
    }



    public boolean contains(String memberId) {
        return users.contains(memberId);
    }

    public void remove(int index) {
        users.remove(index);
    }
}
