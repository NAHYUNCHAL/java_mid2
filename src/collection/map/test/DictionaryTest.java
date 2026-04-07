package collection.map.test;

import java.util.*;

public class DictionaryTest {

    static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("==단어 입력 단계==");

        while (true){
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String string1 = scanner.nextLine();
            if (string1.equals("q")){
                break;

            }
            System.out.print("한글 뜻을 입력하세요: ");
            String string2 = scanner.nextLine();
            map.put(string1,string2);

        }



        System.out.println("==단어 검색 단계==");
        while (true){
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String string1 = scanner.nextLine();
            if (string1.equals("q")){
                break;
            }
            if (map.containsKey(string1)) {
                String value = map.get(string1);
                System.out.println(string1 + "의 뜻: " + value);

            } else {
                System.out.println(string1 + "은(는) 사전에 없는 단어입니다.");
            }

        }



    }
}
