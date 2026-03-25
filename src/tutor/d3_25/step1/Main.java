package tutor.d3_25.step1;

public class Main {
    static void main(String[] args) {

        Dog dog = new Dog("강아지",100,"요크");
        Box box = new Box();
        box.add(dog);
        Dog dog1 = box.getDog();
        System.out.println(dog1.getName());

    }
}
