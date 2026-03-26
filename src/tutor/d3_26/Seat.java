package tutor.d3_26;

public class Seat {
    private boolean state;
    private String seatNub;

    public Seat(String seatNub) {
        this.seatNub = seatNub;
    }

    void useStart() {
        if (state == false) {
            this.state = true;
            System.out.println(seatNub + " 사용 시작");
        } else {
            System.out.println(seatNub + " 이미 사용 중입니다.");
        }
    }

    void useEnd() {
        if (state == true) {
            this.state = false;
            System.out.println(seatNub + " 사용 종료");
        } else {
            System.out.println(seatNub + " 이미 비어 있습니다.");
        }
    }
}
