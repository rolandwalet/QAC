package cinema;

public class OAPTicket extends Ticket {
    OAPTicket(int input){
        tickets = getInteger("OAP");
        price = input;
    }
}
