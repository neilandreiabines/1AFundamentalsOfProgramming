import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LabQuiz1 {

    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Enter your Birth Year: ");
            String birthyearInput = dataIn.readLine();
            int birthyear = Integer.parseInt(birthyearInput);
            String currentYearString = "2026";
            int currentYear = Integer.parseInt(currentYearString);

            System.out.println("You were born last " + birthyear);
            System.out.println("You are now " + (currentYear-birthyear) + "yrs old. ");

        }catch (IOException e) {
            System.err.println("Error reading input stream.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");

        }

    }
}
