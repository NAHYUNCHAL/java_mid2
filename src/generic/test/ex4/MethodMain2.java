package generic.test.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    static void main(String[] args) {

        Dog dog = new Dog("멍멍이",100);
        Cat cat = new Cat("야옹이",100);

        AnimalMethod.checkUp(dog);
        AnimalMethod.checkUp(cat);
        Animal bigger = AnimalMethod.bigger(dog, cat);
        System.out.println(bigger);

    }
}
