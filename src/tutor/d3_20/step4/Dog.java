package tutor.d3_20.step4;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("멍멍");
    }
}
