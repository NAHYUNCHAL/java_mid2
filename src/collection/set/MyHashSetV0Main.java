package collection.set;

public class MyHashSetV0Main {
    static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1);//0(1)
        set.add(2);//0(n)
        set.add(3);//0(n)
        set.add(4);//0(n)
        set.add(5);//0(n)
        System.out.println(set);

        boolean result = set.add(4);
        System.out.println("중복 데이터 저장 결과 = " + result);
        System.out.println(set);

        System.out.println("set.contains(3) = " + set.contais(3));//0(n)
        System.out.println("set.contains(99) = " + set.contais(99));//0(n)
    }
}
