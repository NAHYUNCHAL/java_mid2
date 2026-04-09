package tutor.d4_09;

public class Card {
    private int chargingAmount;

    public Card(int chargingAmount) {


        if (chargingAmount < 0) {
            throw new IllegalArgumentException("0원 미만 충전불가: 잘못된 초기 금액입니다.");

        } else if (chargingAmount > 50000) {
            throw new IllegalArgumentException("50000원 초과 충전불가: 잘못된 초기 금액입니다.");
        }
        this.chargingAmount = chargingAmount;
        System.out.println(chargingAmount + "원 충전 되었습니다");
        System.out.println("현재 잔액은 " + this.chargingAmount + "원 입니다.");


    }

    public boolean use(int amont) {
        if (chargingAmount >= amont) {
            System.out.println(amont + "원 결제 되었습니다");
            chargingAmount -= amont;
            return true;
        } else {
            System.out.println("잔액이 부족합니다");
            return false;
        }
    }
}
