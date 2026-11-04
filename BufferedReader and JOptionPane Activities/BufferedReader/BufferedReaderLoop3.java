import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderLoop3 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            double balance = 20000.00;
            double amount = 0;


            System.out.println("|| Mucho Dinero's Savings Account ||");
            System.out.printf("Starting balance: P%,.2f%n", balance);
            System.out.println("<==Enter positive number to deposit==>\n<==Enter negative number to withdraw, and 0 to stop==>");

            do {
                System.out.print("Enter amount: ");
                amount = Double.parseDouble(br.readLine());

                if (amount > 0) {
                    balance = balance + amount;
                    System.out.printf("Deposit successful: P%,.2f. Balance: P%,.2f%n", amount, balance);
                } else if (amount < 0) {
                    if (balance + amount < 0) {
                        System.out.println("INSUFFICIENT FUNDS!");
                        System.out.printf("Available Balance: P%,.2f%n", balance);
                    } else {
                        balance = balance + amount;
                        System.out.printf("Withdrawal successful: P%,.2f. Available Balance: P%,.2f%n", -amount, balance);
                    }
                }
            } while (amount != 0);

            System.out.printf("Final balance: P%,.2f%n", balance);

        } catch (IOException e) {
            System.out.println("Error input!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input!");
        }
    }
}
