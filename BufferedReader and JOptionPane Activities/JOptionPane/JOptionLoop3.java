import javax.swing.JOptionPane;

public class JOptionLoop3 {

    public static void main(String[] args) {

        try {
            double balance = 20000.00;
            double amount = 0;

            do {
                String prompt = String.format("|| Balance: P%,.2f ||\n<==Enter a positive number to deposit==>" +
                        "\n<==Enter negative number to withdraw, or 0 to stop==> \nEnter amount: ", balance);
                amount = Double.parseDouble(JOptionPane.showInputDialog(null, prompt, "Mucho Dinero's Savings Account", JOptionPane.QUESTION_MESSAGE));

                if (amount > 0) {
                    balance = balance + amount;
                    JOptionPane.showMessageDialog(null, String.format("Deposit successful: P%,.2f%nBalance: P%,.2f", amount, balance), "Deposit", JOptionPane.INFORMATION_MESSAGE);
                } else if (amount < 0) {
                    if (balance + amount < 0) {
                        JOptionPane.showMessageDialog(null, String.format("INSUFFICIENT FUNDS!%nBalance: P%,.2f", balance), "Withdrawal", JOptionPane.WARNING_MESSAGE);
                    } else {
                        balance = balance + amount;
                        JOptionPane.showMessageDialog(null, String.format("Withdrawal successful: P%,.2f%nBalance: P%,.2f", -amount, balance), "Withdrawal", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } while (amount != 0);

            JOptionPane.showMessageDialog(null, String.format("Final balance: P%,.2f", balance), "Done", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Input!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
