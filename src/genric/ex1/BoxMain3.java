package genric.ex1;

public class BoxMain3 {
    static void main(String[] args) {
        GenericBox<Integer> integerbox = new GenericBox<Integer>(); // 생성 시점에 T의 타입 결정
        integerbox.set(10);
        //integerbox.set("hello"); Integer 타입의 허용, 컴파일 오류
        Integer integer = integerbox.get(); // Integer 타입 반환 (캐스팅 안해도됨)
        System.out.println("integer = " + integer);

        GenericBox<String> stringbox = new GenericBox<String>();
        stringbox.set("hello");
        String str = stringbox.get();
        System.out.println("str = " + str);

        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double doublaValue = doubleBox.get();
        System.out.println("doublaValue = " + doublaValue);
    }
}
