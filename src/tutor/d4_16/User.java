package tutor.d4_16;



public class User {
    private Employee_card card;

    public User(Employee_card card) {
        this.card = card;
    }

    public void registrationCall(Operating_system computer) {
        computer.Enrollment_Connection(card);
    }

    public void inquiryCall(Operating_system computer) {
        computer.Inquiry_Connection(card);
    }

    public void deleteCall(Operating_system computer) {
        computer.Delete_Connection(card);
    }
    public void Size_Connection (Operating_system computer) {
        computer.Size_Connection(card);
    }



}
