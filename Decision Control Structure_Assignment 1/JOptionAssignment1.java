import javax.swing.JOptionPane;

public class JOptionAssignment1 {

    public static void main(String[] args) {

        try {
            String yearInput = JOptionPane.showInputDialog(null, "Enter a year:");
                int year = Integer.parseInt(yearInput);
                int leap = year / 4;

                    if (leap * 4 == year) {
                        JOptionPane.showMessageDialog(null, "The year " + year + " is a leap year", "Result", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "The year " + year + " is not a leap year", "Result", JOptionPane.INFORMATION_MESSAGE);
                    }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Input!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }
}