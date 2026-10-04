import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderAssignment1 {

    public static void main(String[] args) {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a year: ");
            int year = Integer.parseInt(bfr.readLine());
            int leap = year / 4;

            if (leap * 4 == year) {
                System.out.println("The year " + year + " is a leap year");
            } else {
                System.out.println("The year " + year + " is not a leap year");
            }

        } catch (IOException e) {
            System.out.println("Error input!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input!");

        }
    }
}