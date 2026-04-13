package tutor.d4_13;

public class User {
    private String memberId;
    private Rating rating;

    public User(String memberId, Rating rating) {
        this.memberId = memberId;
        this.rating = rating;
    }

    public void registration(System1 system1) { // 등록
        system1.checkList(memberId,rating);
    }
    public void inquiry(System1 system1) { //조회
        system1.toCheck(memberId);
    }
    public void cancle(System1 system1) { //삭제
        system1.removIndex(memberId);
    }

    public void entire(System1 system1) {
        if (system1.contains(memberId)) {
            system1.theEntire();
        } else {
            throw new IllegalArgumentException("사용할수 없습니다.");
        }

    }


}
