package tutor1.d4_30;

import java.util.Arrays;
import java.util.Objects;

public class Lecture {
    private boolean openClose = true;
    private String[] members = new String[5];
    private int count;

    public void registrationCheck(String name)  {
        if (name == null) {
            throw new NullPointerException("null은 들어올수 없다");
        }


        if (openClose) {
            if (Seat()) {
                if (prosecutor(name)){
                    members[count] = name;
                    count++;
                    System.out.println(name + "가 등록 되었습니다.");
                }
            }
        } else {
            throw new NullPointerException("마감된 강의 입나다.");
        }
    }


    public void openClose() { //마감
        openClose = false;

    }
    private boolean Seat() {
        if (count >= members.length ) {
            throw new IllegalArgumentException("[오류] 배열 공간이 가득 찼습니다. 더 이상 등록할 수 없습니다.");
        }
        return true;
    }
    private boolean prosecutor(String name) {
        for (int i = 0; i < count; i++) {
            if (members[i].equals(name)){
                throw new IllegalArgumentException("같은 이름은 등록할수없습니다");
            }

        }
        return true;
    }


}
