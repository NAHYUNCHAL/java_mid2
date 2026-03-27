package tutor.d3_27;

public class BookMain {
    static void main(String[] args) {
        Book book = new Book("어린왕자", "1234");
        book.bookRental();
        book.bookRental();
        book.bookReturn();
        book.bookReturn();

    }
}
