import javax.swing.JOptionPane;

public class JOptionLoop1 {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "<===Highest and Lowest Number===> ", "Enter 10 numbers", JOptionPane.INFORMATION_MESSAGE);

        try {
            int highest = 0;
            int lowest = 0;
            String numbers = "";

            for (int i = 1; i <= 10; i++) {
                int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number " + i + ":", "Highest and Lowest", JOptionPane.QUESTION_MESSAGE));

                numbers = numbers + "Number " + i + ": " + num + "\n";

                if (i == 1) {
                    highest = num;
                    lowest = num;
                } else if (num > highest) {
                    highest = num;
                } else if (num < lowest) {
                    lowest = num;
                }
            }

            JOptionPane.showMessageDialog(null, numbers + "\nThe highest number is " + highest + "\nThe lowest number is " + lowest, "Result", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Input!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
