import javax.swing.JOptionPane;

public class JOptionLoop2 {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "<===Even numbers from 2 to 100===> ", "Click OK", JOptionPane.INFORMATION_MESSAGE);

        String result = "";

        for (int i = 2; i <= 100; i += 2) {
            result = result + i + " ";

            if (i % 20 == 0) {
                result = result + "\n";   // new line after every multiple of 20
            }
        }

        JOptionPane.showMessageDialog(null, result, "Even Numbers from 2 to 100", JOptionPane.INFORMATION_MESSAGE);
    }
}
