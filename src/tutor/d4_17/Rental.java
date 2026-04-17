package tutor.d4_17;

import java.util.*;

public class Rental {
    private Map<Integer,Transport> map = new HashMap<>(); //자전거저장
    private Integer count = 1;




    public void bicycle_Registration(Transport bike) { // 자전거 등록
        map.put(count,bike);
        count++;

    }

    public void rentTransport(String name,Integer num) { //자전거 빌림
        if (num == 0) {
            throw new IllegalArgumentException("없는 자전거 번호, 1번부터 입니다.");
        }
        Transport transport = map.get(num);
        if (transport.rent(name,num )) {
            System.out.println(num + "번 자전거 대여 했습니다.");
        } else {
            throw new IllegalArgumentException("이미 자전거 빌렸습니다.");


        }

    }

    public void returnTransport(String name,Integer num) {
        Transport transport = map.get(num);
        if (transport.returnTransport(name,num)) {

            System.out.println("반납 했습니다.");
        } else {
            throw new IllegalArgumentException(num +"번 자전거 빌린 정보가 없네요");
        }

    }

    public void inquiry_Connect() {
        for (Map.Entry<Integer, Transport> entry : map.entrySet()) {
            Integer num = entry.getKey();
            Transport transport = entry.getValue();

            List<String> inquiry = transport.inquiry();
            System.out.println(num + "번 자전거 -> " + inquiry);
        }
    }




}


