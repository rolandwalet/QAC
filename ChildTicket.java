package cinema;

public class ChildTicket extends Ticket {
    ChildTicket(int input){
        tickets = getInteger("Child");
        price = input;
    }
}
