package collection.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueNamesTest1 {
    static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < inputArr.length; i++) {
            int a = inputArr[i];
            hashSet.add(a);
        }
        for (Integer integer : hashSet) {
            System.out.println(integer);

        }
    }

}
