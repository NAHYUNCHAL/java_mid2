package tutor.d4_07;

public class Member {
    private String memberId;

    public Member(String memberId) {
        this.memberId = memberId;
    }

    public void seatRequest(Cafe cafe, int seatNum) { // Chair 대신 번호를 받음
        System.out.println(memberId + "님이 " + seatNum + "번 좌석 사용을 요청합니다.");
        cafe.used(this.memberId, seatNum); // 카페에게 요청을 전달
    }
    public void ckeckOut(Cafe cafe) {
        System.out.println("좌석 사용 종료");
        cafe.finish(memberId);
    }

    public String getMemberId() {
        return memberId;
    }
}
