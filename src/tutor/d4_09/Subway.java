package tutor.d4_09;

public class Subway {
    private int price = 1500;


    public int getPrice() {
        return price;
    }

    public void tag(Card card) {
        if (card.use(price)) {
            System.out.println("지하철 이용 가능합니다");
        }else {
            System.out.println("지하철 이용 불가입니다.");
        }

    }
}
