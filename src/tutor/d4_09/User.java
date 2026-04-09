package tutor.d4_09;

public class User {
    private Card card;// 사용자는 자기 카드 정보는 있어야한다.

    public User(Card card) {
        this.card = card;
    }

    public void usedSubway(Subway subway) { //지하철 이용할게
        subway.tag(card);
    }
}
