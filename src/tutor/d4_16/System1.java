package tutor.d4_16;


import java.util.HashSet;


import java.util.Set;


public class System1 {

    private Set<Employee_card> set = new HashSet<>();

    public Set<Employee_card> getSet() {
        return set;
    }


    public int registration(Employee_card card) {
        Employee_card foundCard = findByMemberNub(card);

        if (foundCard != null){ //사변이 같음
            if (!foundCard.getName().equals(card.getName())) {
                return 2; // 사번 같고 이름 다름
            }
            return 3; // 사번 같고 이름도 같음
        }
        set.add(card);
        return 1;
    }

    public Employee_card inquiry(Employee_card card) {
        return inquiry_Logic(card);
    }

    public boolean delete(Employee_card card) {
        if (contains1(card)) { // 이미 등록
            set.remove(card); // 삭제
            return true;
        } else {

            return false;
        }
    }


    public int size() {

        return set.size();

    }

    private boolean contains1(Employee_card card) {

        return set.contains(card);
    }
    private Employee_card findByMemberNub(Employee_card card) {
        for (Employee_card employeeCard : set) {
            if (card.getMemberNub() == employeeCard.getMemberNub()) {
                return employeeCard;
            }
        }
        return null;
    }




    private Employee_card inquiry_Logic(Employee_card card) {
        for (Employee_card employeeCard : set) {
            if (employeeCard.equals(card)) {
                return employeeCard;

            }

        }

        return null;

    }
}