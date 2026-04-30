package tutor1.d4_30;

public class AcademyMain {
    static void main(String[] args) {
        Academy academy = new Academy();
        Lecture lecture = new Lecture();
        Member member1 = new Member("회원1");
        Member member2 = new Member("회원2");
        Member member3 = new Member("회원3");
        Member member4 = new Member("회원4");
        Member member5 = new Member("회원5");

        academy.addname(member1);
        academy.registration(lecture);
        academy.addname(member2);
        academy.registration(lecture);
        academy.addname(member2);
        academy.registration(lecture);
        academy.addname(member4);
        academy.registration(lecture);
        lecture.openClose();
        academy.addname(member5);
        academy.registration(lecture);


    }
}
