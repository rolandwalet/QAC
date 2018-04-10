package cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ticket standard, oap, student, child;
        String day = getDay();
        
        if (day.equals("Wednesday")){
            standard = new StandardTicket(6);
            oap = new OAPTicket(4);
            student = new StudentTicket(4);
            child = new ChildTicket(2);
        }
        
        else {
            standard = new StandardTicket(8);
            oap = new OAPTicket(6);
            student = new StudentTicket(6);
            child = new ChildTicket(4);
        }
        
        standard.getTotal();
        oap.getTotal();
        student.getTotal();
        child.getTotal();
        
        int totalCost = standard.total + oap.total + student.total + child.total;
        System.out.println("Total cost is: £" + totalCost);
    }
    private static String getDay(){                                             //define method for obtaining and checking day
        Scanner scanner = new Scanner(System.in);
        
        String day;
        do{
            System.out.println("Please enter the day of the film"
                    + " (Use full day name, case sensitive): ");
            while (!scanner.hasNext()) {
                int wrongInput = scanner.nextInt();
                System.out.println(wrongInput + "is an invalid input. Please "
                        + "try again: ");
            }
            day = scanner.next();
        }while(!day.equals("Moday") && !day.equals("Tuesday") &&
                !day.equals("Wednesday") && !day.equals("Thursday")
                && !day.equals("Friday") && !day.equals("Saturday") &&
                !day.equals("Sunday"));
        return day;
    }
}
