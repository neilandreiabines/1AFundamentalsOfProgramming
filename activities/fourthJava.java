import java.io.*;

public class fourthJava {
        public static void main (String[] args) {

            String filePath = "Abines and Mendijar";

                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
                    writer.write("This is the first line of text.");
                    writer.newLine();
                    writer.write("This is the second line of text.");
                    writer.newLine();
                    writer.write("BufferedWriter makes writing fast and efficient.");
                    System.out.println("Data successfully written in the file.");}

                    catch (IOException e) {
                        System.err.println("An error occured while writing to this file.");
                        e.printStackTrace();
                    }
        }
}
