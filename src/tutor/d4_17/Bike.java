package tutor.d4_17;

import java.util.*;

public class Bike implements Transport{

    private List<String> map = new ArrayList<>(); //자전거 대여여부
    private List<Integer> list = new ArrayList<>();


    @Override
    public List<String> inquiry() {
        return new ArrayList<>(map);
    }

    @Override
    public boolean rent(String name, Integer num) {
        if (contains1(name,num)) {
            return false; //등록 되어있음
        }else {
            map.add(name); // 자전거 대여
            list.add(num);
            return true;
        }
    }

    @Override
    public boolean returnTransport(String name,Integer num) {
        if (contains1(name,num)) {
            map.remove(name);
            list.remove(num);
            return true;
        } else {
            return false;
        }
    }

    private boolean contains1(String name,Integer num) {
        if (map.contains(name) || list.contains(num)) {
            return true;
        } else {
            return false;
        }


    }


}
