import java.io.IOException;
import java.util.Scanner;

public class ScannerAssignment2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Hourly rate: ");
        double hourlyrate = scnr.nextDouble();
        System.out.print("Hours worked: ");
        double hoursworked = scnr.nextDouble();

        double gross = hourlyrate * hoursworked;
        double percent;

        if (gross<=2000) {
            percent = 10;
        } else if (gross<=4000) {
            percent = 12;
        } else if (gross<=10000){
            percent = 15;
        } else {
            percent = 20;
        }

        double tax = gross * percent / 100;
        double netpay = gross - tax;

        System.out.printf("Your Gross pay: %.2f%n", gross);
        System.out.printf("Your Withholding Tax: %.2f%n", tax);
        System.out.printf("Your Net pay: %.2f%n", netpay);

    }

}
