import java.util.Scanner;

public class Labquiz2 {

    public static void main(String[] args) {

        System.out.println("Welcome to Adobo Cooking Show");
        String name;
        double kg;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = inputDevice.nextLine();
        System.out.print("How many kilo of pork you will cook? ");
        kg = inputDevice.nextDouble();

        Double soy = kg * (1.0 / 2.0);
        Double vinegar = kg * (1.0 / 3.0);

        System.out.println("The ratio of soy sauce for " + kg + " kg is " + soy);
        System.out.println("The ratio of vinegar for " + kg + " kg is " + vinegar);
    }

}
