package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elementData = new int[10];

    private int size = 0;

    public boolean add(int value) {
        if (contais(value)) {
            return false;
        }

        elementData[size] = value;
        size++;
        return true;
    }
    //o(n)
    public boolean contais(int value) { //중복 확인
        for (int data : elementData) {
            if (data == value) {
                return true;
            }

        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData,size)) +
                ", size=" + size +
                '}';
    }
}
