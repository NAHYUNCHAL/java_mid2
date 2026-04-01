package tutor.d3_31.step1;

public class Main {
    static void main(String[] args) {
        Member member = new Member("회원1");
        Coupon coupon1 = new Coupon("회원1");
        Coupon coupon2 = new Coupon("회원2");


        coupon1.belongsTo(member);
        coupon1.canUse();
        coupon1.belongsTo(member);
        coupon1.canUse();
        coupon2.belongsTo(member);


    }
}
