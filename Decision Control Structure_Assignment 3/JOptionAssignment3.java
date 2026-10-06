import javax.swing.JOptionPane;

public class JOptionAssignment3 {

    public static void main(String[] args) {

        try {
            int NSATScore = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the student's NSAT Score?", "Data", JOptionPane.INFORMATION_MESSAGE));
            int parentsSalary = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the student's parents' salary?", "Data", JOptionPane.INFORMATION_MESSAGE));
            int entranceExamScore = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the student's Entrance Exam Score?", "Data", JOptionPane.INFORMATION_MESSAGE));

            double average = (NSATScore + entranceExamScore) / 2.0;
            String result;

            if (parentsSalary > 10000 || NSATScore < 90 || entranceExamScore < 85) {
                result = "The applicant is rejected!";
            } else if (parentsSalary <= 3500 && average >= 91) {
                result = "The applicant is accepted!";
            } else {
                result = "The applicant is for further study.";
            }

            JOptionPane.showMessageDialog(null, result, "Scholarship Result", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Input!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }
}