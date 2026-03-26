package tutor.d3_26;

public class Box {
    private boolean stored;
    private String boxNum;

    public Box(String boxNum) {
        this.boxNum = boxNum;
    }

    void put()  {
        if (!stored) {
            this.stored = true;
            System.out.println(boxNum + " 택배 보관 완료");
        } else {
            System.out.println(boxNum + " 이미 택배가 보관 중입니다.");
        }
    }

    void take() {
        if (stored) {
            this.stored = false;
            System.out.println(boxNum + " 택배 꺼내기 완료");
        } else {
            System.out.println(boxNum + " 보관함이 비어 있습니다.");
        }
    }


}
