package tutor.d4_17;

public class RentalMain {
    static void main(String[] args) {
        Rental rental = new Rental();
        Transport transport1 = new Bike();
        Transport transport2 = new Bike();
        Transport transport3 = new Bike();

        rental.bicycle_Registration(transport1);
        rental.bicycle_Registration(transport2);
        rental.bicycle_Registration(transport3);

        rental.rentTransport("회원1",1);
        rental.rentTransport("회원2",2);
        rental.rentTransport("회원3",3);
        rental.returnTransport("회원1",1);
        rental.returnTransport("회원2",2);
        rental.rentTransport("회원2",2);

        rental.inquiry_Connect();



    }
}
