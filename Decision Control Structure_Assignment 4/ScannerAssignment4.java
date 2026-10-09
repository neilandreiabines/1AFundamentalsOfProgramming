import java.util.Scanner;

public class ScannerAssignment4 {

    public static void main(String[] args) {

                Scanner scnr = new Scanner(System.in);

                System.out.println("Welcome to Jedi Military Academy!");
                System.out.print("Press Enter to continue...");
                scnr.nextLine();   // waits until Enter is pressed

                System.out.print("Enter your height (cm): ");
                double height = scnr.nextDouble();
                System.out.print("Enter your age: ");
                int age = scnr.nextInt();
                System.out.print("Enter your Citizenship code (C: Citizen of Endor or N: Non-citizen of Endor): ");
                char citizen = scnr.next().toUpperCase().charAt(0);
                System.out.print("Enter Recommendee code (R: Recommendee of Jedi Master Obi Wan or N: Non-recommendee): ");
                char rec = scnr.next().toUpperCase().charAt(0);

                if (rec == 'R') {
                    System.out.println("Congratulations you are ACCEPTED! ");
                } else if (height >= 200 && age >= 21 && age <= 25 && citizen == 'C') {
                    System.out.println("Congratulations you are ACCEPTED! ");
                } else {
                    System.out.println("The applicant is REJECTED.");

                }
            }
        }
