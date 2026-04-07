package tutor.d4_7;

public class Chair {

    private boolean state;
    private int num;

    public Chair(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public boolean use() {
        if (!state) {
            System.out.println(num + "번 사용하겠습니다.");
            state = true;
            return true;
        } else {
            System.out.println(num + "번 좌석 이미 사용 중인 좌석입니다");
            return false;
        }
    }

    public void checkOut() {
        System.out.println(num + "번 좌석 사용종료");
        state = false;
    }
}
