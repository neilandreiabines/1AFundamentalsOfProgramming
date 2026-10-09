import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderAssignment4 {

            public static void main(String[] args) {

                BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

                try {
                    System.out.println("Welcome to Jedi Military Academy!");
                    System.out.print("Press Enter to continue...");
                    bfr.readLine();   // waits until Enter is pressed

                    System.out.print("Enter your height (cm): ");
                    double height = Double.parseDouble(bfr.readLine());
                    System.out.print("Enter your age: ");
                    int age = Integer.parseInt(bfr.readLine());
                    System.out.print("Enter your Citizenship code (C: Citizen of Endor or N: Non-citizen of Endor): ");
                    char citizen = bfr.readLine().toUpperCase().charAt(0);
                    System.out.print("Enter Recommendee code (R: Recommendee of Jedi Master Obi Wan or N: Non-recommendee): ");
                    char rec = bfr.readLine().toUpperCase().charAt(0);

                    if (rec == 'R') {
                        System.out.println("Congratulations you are ACCEPTED! ");
                    } else if (height >= 200 && age >= 21 && age <= 25 && citizen == 'C') {
                        System.out.println("Congratulations you are ACCEPTED! ");
                    } else {
                        System.out.println("The applicant is REJECTED.");
                    }

                } catch (IOException e) {
                    System.out.println("Error input!");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Input!");

                }
            }
        }