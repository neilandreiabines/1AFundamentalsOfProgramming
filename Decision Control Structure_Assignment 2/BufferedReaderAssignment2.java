import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

    public class BufferedReaderAssignment2 {

        public static void main(String[] args) {

            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

            try {

            System.out.print("Hourly rate: ");
            String hourlyrateInput = bfr.readLine();
            double hourlyrate = Double.parseDouble(hourlyrateInput);

                System.out.print("Hours worked: ");
                String hoursworkedInput = bfr.readLine();
                double hoursworked = Double.parseDouble(hoursworkedInput);

                double gross = hourlyrate * hoursworked;
                double percent;

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

                        System.out.printf("Your Gross Pay: %.2f%n", gross);
                        System.out.printf("Your Withholding Tax: %.2f%n", tax);
                        System.out.printf("Your Net pay: %.2f%n", netpay);

            } catch (IOException e) {
                System.out.println("Error input!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input!");

            }
    }
}
