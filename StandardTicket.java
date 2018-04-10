package cinema;

public class StandardTicket extends Ticket {
    StandardTicket(int input){
        tickets = getInteger("Standard");
        price = input;
    }
}
