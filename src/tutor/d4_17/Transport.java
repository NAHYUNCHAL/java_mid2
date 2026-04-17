package tutor.d4_17;

import java.util.List;
import java.util.Map;

public interface Transport {
    List<String> inquiry(); //조회
    boolean rent(String name,Integer num); //대여
    boolean returnTransport(String name,Integer num); //반납


}
