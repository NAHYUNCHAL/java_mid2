package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {
    static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},
                {"JPA", "30000"}};

        Map<String, String> productMap = new HashMap<>();

        for (String[] product : productArr) {
            productMap.put(product[0], product[1]);
        }

        Set<Map.Entry<String, String>> entries = productMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("제품: " + key + ", 가격: " + value);
        }



    }
}
