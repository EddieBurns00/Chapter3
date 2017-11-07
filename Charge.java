import java.util.Scanner;
import java.text.NumberFormat;

public class Charge {
    public static void main (String[]args) {
        double previousBalance;
        double charges;
        double newBalance;
        double interest = 1.02;
        double minimumPayment = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter Previous Balance: ");
        previousBalance = scan.nextDouble();
        System.out.print ("Enter Charges: ");
        charges = scan.nextDouble();
        
        newBalance = previousBalance + charges;
        newBalance = newBalance * interest;
        
        if (newBalance < 50) {
            minimumPayment = newBalance;
        }
        
        if (newBalance >= 50  && newBalance <= 300) {
            minimumPayment = 50;
        }
        
        if (newBalance > 300) {
            minimumPayment = newBalance * .2;
        }
        
        System.out.println ("\nCS CARD International Statement");
        System.out.println ("===============================\n");
        System.out.println ("Previous Balance:\t$" + previousBalance);
        System.out.println ("Additional Charges:\t$" + charges);
        System.out.println ("Interest:\t\t$" + (newBalance - (previousBalance + charges)));
        System.out.println ("\nNew Balance:\t\t$" + newBalance);
        System.out.println ("\nMinimum Payment:\t$" + minimumPayment);
        
        
        
    }
}