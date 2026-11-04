import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderLoop1 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("<===Highest and Lowest Number===>");
        System.out.println("Enter 10 numbers.");

        try {
            int highest = 0;
            int lowest = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Enter number " + i + ": ");
                int number = Integer.parseInt(br.readLine());

                if (i == 1) {
                    highest = number;
                    lowest = number;
                } else if (number > highest) {
                    highest = number;
                } else if (number < lowest) {
                    lowest = number;
                }
            }

            System.out.println("The highest number is " + highest);
            System.out.println("The lowest number is " + lowest);

        } catch (IOException e) {
            System.out.println("Error input!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input!");
        }
    }
}
