package tutor.d4_7;

public class MemberMain {
    public static void main(String[] args) {
        // 1. 준비 (Setup)
        Cafe cafe = new Cafe(new Chair(1), new Chair(2), new Chair(3));
        Member member1 = new Member("회원1");

        // 2. 실행 (Trigger) - 카페를 직접 부르는 게 아니라 멤버를 통해 요청
        member1.seatRequest(cafe, 1);

        // 3. 종료
        member1.ckeckOut(cafe);
    }

}