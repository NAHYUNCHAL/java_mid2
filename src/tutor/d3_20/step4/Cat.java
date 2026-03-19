package tutor.d3_20.step4;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("야옹");
    }
}
