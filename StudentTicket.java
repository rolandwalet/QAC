package cinema;

public class StudentTicket extends Ticket {
    StudentTicket(int input){
        tickets = getInteger("Student");
        price = input;
    }
}
