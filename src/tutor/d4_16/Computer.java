package tutor.d4_16;

import java.util.Set;

public class Computer implements Operating_system{
    private System1 system1;


    public Computer(System1 system1) {
        this.system1 = system1;
    }

    @Override
    public void Enrollment_Connection(Employee_card card) {
        int registration = system1.registration(card);
        if (registration == 1) {
            System.out.println(card.getName() + "사원증 등록했습니다.");
        } else if (registration == 2) {
            throw new IllegalArgumentException("해당 사번은 이미 다른 사용자가 사용 중입니다.");
        } else if (registration == 3) {
            throw new IllegalArgumentException("이미 등록된 사원증입니다.");
        }
    }

    @Override
    public void Inquiry_Connection(Employee_card card) { // 조회 연결
        Employee_card inquiry = system1.inquiry(card);
        if (inquiry == null) {
            throw new IllegalArgumentException("조회 정보가 없습니다.");
        } else {
            System.out.println(inquiry); // 객체 조회
        }
    }

    @Override
    public void Delete_Connection(Employee_card card) {
        if (system1.delete(card)) {
            System.out.println("삭제가 완료 되었습니다.");
        } else {
            throw new IllegalArgumentException("삭제할 대상이 없습니다.");
        }
    }

    @Override
    public void Size_Connection(Employee_card card) {
        int size = system1.size();
        System.out.println(size + "개의 사원증 발급 되었습니다.");
    }



}
