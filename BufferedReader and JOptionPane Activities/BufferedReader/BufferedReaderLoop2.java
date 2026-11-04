import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderLoop2 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("<===Even numbers from 2 to 100===>");
            System.out.print("Press Enter to start...");
            br.readLine();   // waits until Enter is pressed

            for (int i = 2; i <= 100; i += 2) {
                System.out.print(i + " ");

                if (i % 20 == 0) {
                    System.out.println();   // this creates new line after every multiple of 20
                }
            }

        } catch (IOException e) {
            System.out.println("Error input!");
        }
    }
}
