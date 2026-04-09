package tutor.d4_09;

public class SubwayMain {
    static void main(String[] args) {
        Card card1 = new Card(2500);

        Subway subway = new Subway();



        User user1 = new User(card1);

        user1.usedSubway(subway);
        user1.usedSubway(subway);



    }
}
