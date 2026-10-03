import javax.swing.JOptionPane;

public class JOptionAssignment2 {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Decision Control Structure: Assignment 2");

        String hourlyrateInput = JOptionPane.showInputDialog("Enter your Hourly rate: ");
        String hoursworkedInput = JOptionPane.showInputDialog("Enter how many hours you worked: ");

        try {

        double hourlyrate = Double.parseDouble(hourlyrateInput);
        double hourlyworked = Double.parseDouble(hoursworkedInput);
        double percent;

         double gross = hourlyrate * hourlyworked;

            if (gross <= 2000) {
                percent = 10;
            } else if (gross <= 4000) {
                percent = 12;
            } else if (gross <= 10000) {
                percent = 15;
            } else {
                percent = 20;
            }

                double tax = gross * percent / 100;
                double netpay = gross - tax;

                String result = String.format("Hourly rate: %.2f%nHours worked: %.2f%nYour gross pay: %.2f%nYour Withholding Tax: %.2f%nYour Net pay: %.2f%n", hourlyrate, hourlyworked, gross, tax, netpay);

                JOptionPane.showMessageDialog(null, result, "Payroll Result", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
        }

    }
}
