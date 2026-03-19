package generic.ex1;

public class RowTypeMain {
    static void main(String[] args) {

        GenericBox integerBox = new GenericBox();//이게 가능은 하지만 쓰면 안된다 밑에꺼 사용해라
        //GenericBox<Object> integerBox = new GenericBox<>(); 권장
        //integerBox.set(10);
    }
}
