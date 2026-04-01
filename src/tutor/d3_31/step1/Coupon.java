package tutor.d3_31.step1;

public class Coupon {
    private String ownerId;
    private boolean used;

    public Coupon(String ownerId) {
        this.ownerId = ownerId;
    }

    public void belongsTo(Member member) {
        if(ownerId.equals(member.getMemberId())) {
            System.out.println("회원 정보 일치 사용가능");
        }else {
            System.out.println("회원 정보 불일치 사용불가");
        }
    }



    public void canUse() {
        if (!used) {
            System.out.println("사용가능");
            used = true;
        } else {
            System.out.println("이미 사용 사용불가");
        }
    }
}
