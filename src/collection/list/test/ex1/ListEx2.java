package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    static void main(String[] args) {

        List<Integer> list = new ArrayList<>();


        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            list.add(n);


        }

        System.out.println("출력");
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j));
            if (j < list.size() - 1) {
                System.out.print(", ");
            }
        }

    }
}
