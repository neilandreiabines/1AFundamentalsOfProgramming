import javax.swing.JOptionPane;
public class JOptionAssignment4 {
    public static void main(String[] args) {

        try {

            JOptionPane.showMessageDialog(null, "Welcome to Jedi Military Academy!", "Jedi Knight Military Academy", JOptionPane.INFORMATION_MESSAGE);

            double height = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your height (cm): ", "Enter your information", JOptionPane.INFORMATION_MESSAGE));
            int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age: ", "Enter your information", JOptionPane.INFORMATION_MESSAGE));
            char citizen = JOptionPane.showInputDialog("Enter your Citizenship Code: \n(C: Citizen of Endor or N: Non-citizen of Endor) ").toUpperCase().charAt(0);
            char rec = JOptionPane.showInputDialog("Enter Recommendee Code: \n(R: Recommendee of Jedi Master Obi Wan or N: Non-recommendee) ").toUpperCase().charAt(0);

            if (rec == 'R') {
                JOptionPane.showMessageDialog(null, "Congratulations you are ACCEPTED! ", "Application Result", JOptionPane.INFORMATION_MESSAGE);
            } else if (height >= 200 && age >= 21 && age <= 25 && citizen == 'C') {
                JOptionPane.showMessageDialog(null, "Congratulations you are ACCEPTED! ", "Application Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "The applicant is REJECTED.", "Application Result", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Input!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }
}
