package tutor1.d4_30;

public class Academy {
    private Member member;

    public void addname(Member member) {
        this.member = member;
    }

    public void registration(Lecture lecture) {
        lecture.registrationCheck(member.getName());
    }
}
