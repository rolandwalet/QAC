package cinema;

import java.util.Scanner;

public abstract class Ticket {
    int price;
    int total;
    int tickets;
    
    protected void getTotal() {
        total += (price*tickets);
    }
    
    Ticket(){
        total = 0;
    }
    
    protected static int getInteger(String ticketType){                         //define method to obtain ticket numbers
        Scanner scanner = new Scanner(System.in);
        
        int number;
        do{
            System.out.println("Please enter number of " + ticketType
                    + " tickets: ");
            while (!scanner.hasNextInt()) {
                String wrongInput = scanner.next();
                System.out.println(wrongInput + " is an invalid input. Please "
                        + "try again: ");
            }
            number = scanner.nextInt();
        } while  (number < 0);
        return number;
    }
}