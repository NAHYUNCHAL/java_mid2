package tutor.d3_20.step4;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void sound() {
        System.out.println("동물 소리");
    }
}
