package tutor.d3_27;

public class Book {
    private String title;
    private String booId;
    private boolean rented;

    public Book(String title, String booId) {
        this.title = title;
        this.booId = booId;
    }

    public void bookRental(){
        if (!rented) {
            this.rented = true;
            System.out.println(title + " 대여");
        } else {
            System.out.println(title + " 대여중 대여 불가");
        }
    }

    public void bookReturn(){
        if (rented) {
            this.rented = false;
            System.out.println(title + " 반납");
        } else {
            System.out.println(title + " 반납을 이미 했습니다.");
        }
    }
}
