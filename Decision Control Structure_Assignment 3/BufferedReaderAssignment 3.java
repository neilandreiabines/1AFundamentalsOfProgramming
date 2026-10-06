import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderAssignment3 {

    public static void main(String[] args) {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("What is the student's NSAT Score?: ");
            int NSATScore = Integer.parseInt(bfr.readLine());

            System.out.print("What is the student's parents' salary?: ");
            int parentsSalary = Integer.parseInt(bfr.readLine());

            System.out.print("What is the student's Entrance Exam Score?: ");
            int entranceExamScore = Integer.parseInt(bfr.readLine());

            double average = (NSATScore + entranceExamScore) / 2.0;

            if (parentsSalary > 10000 || NSATScore < 90 || entranceExamScore < 85) {
                System.out.println("The applicant is rejected!");
            } else if (parentsSalary <= 3500 && average >= 91) {
                System.out.println("The applicant is accepted!");
            } else {
                System.out.println("The applicant is for further study.");
            }

        } catch (IOException e) {
            System.out.println("Error input!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input!");
        }
    }
}