import javax.swing.JOptionPane;

public class LabQuiz3 {

    public static void main(String[] args){

    JOptionPane.showMessageDialog(null, " Hello, Welcome to XYZ's Pizza Parlor!");

    String grossInput = JOptionPane.showInputDialog("Enter your gross bill: ");
    String amountInput =  JOptionPane.showInputDialog("Enter the amount: ");

    double grossBill = Double.parseDouble(grossInput);
    double amount = Double.parseDouble(amountInput);

    double serviceCharge = grossBill * 0.12;
    double salesTax = grossBill * 0.07;
    double netBill = grossBill + serviceCharge + salesTax;
    double change = amount - netBill;

    JOptionPane.showMessageDialog(null, "Your gross bill is " + String.format("%.2f", grossBill) +
            "\nService Charge: " + String.format("%.2f", serviceCharge) +
            "\nSales Tax: " + String.format("%.2f", salesTax) +
            "\nYour Net bill: " + String.format("%.2f", netBill) +
            "\nYour change is: " + String.format("%.2f",  change));

    }
}
