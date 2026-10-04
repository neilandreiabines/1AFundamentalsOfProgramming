import java.util.Scanner;

public class ScannerAssignment1 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scnr.nextInt();
        int leap = year / 4;

        if (leap * 4 == year) {
            System.out.println("The year " + year + " is a leap year");
        } else {
            System.out.println("The year " + year + " is not a leap year");
        }
    }
}
