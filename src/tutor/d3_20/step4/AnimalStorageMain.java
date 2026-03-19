package tutor.d3_20.step4;

public class AnimalStorageMain {
    static void main(String[] args) {
        AnimalStorage<Dog> dogAnimalStorage = new AnimalStorage<>();
        System.out.println("처음 상태: " + dogAnimalStorage.isEmpty());
        dogAnimalStorage.save(new Dog("바둑이"));
        Dog dog = dogAnimalStorage.find();
        System.out.println("이름1: " + dog.getName());
        dog.sound();
        System.out.println("저장 후 상태: " + dogAnimalStorage.isEmpty());
        AnimalStorage<Cat> catAnimalStorage = new AnimalStorage<>();
        catAnimalStorage.save(new Cat("나비"));
        Cat cat = catAnimalStorage.find();
        System.out.println("이름2: " + cat.getName());
        cat.sound();


    }
}
