package collection.set;


import java.util.Arrays;

public class HashStart1 {
    static void main(String[] args) {
        Integer[] inputArray = {1,2,5,8};

        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
        //4번 반복(0(n)
        for (Integer inputValue : inputArray) {
            if (inputValue == searchValue) {
                System.out.println(inputValue);
            }

        }
    }



}



