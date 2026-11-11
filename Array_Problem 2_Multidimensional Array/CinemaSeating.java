// Nag-import ako ng Arrays class para magamit ko ang Arrays.deepToString()
import java.util.Arrays;

// Ito ang class ng program
public class CinemaSeating {

    // Ito ang main method, dito nagsisimulang tumakbo ang program
    public static void main(String[] args) {

        // Nag-deklara ako ng 2D String array na pangalan ay seats, 2 rows at 3 columns
        String[][] seats = {
                // Row 1 (index 0): ito yung mga nakaupo sa unang row
                {"Alice", "Bob", "Charlie"},
                // Row 2 (index 1): ito yung mga nakaupo sa pangalawang row
                {"David", "Emma", "Frank"}
        };

        // Piniprint ko ang pangalan ng nakaupo sa second row, third column. Index 1 ang row at index 2 ang column kasi nagsisimula sa 0 ang index
        System.out.println(seats[1][2]);

        // Pinalitan ko ang "Bob" ng "Vacant". Nasa first row (index 0), second column (index 1) si Bob
        seats[0][1] = "Vacant";

        // Piniprint ko ang buong seating arrangement sa isang line gamit ang Arrays.deepToString()
        System.out.println(Arrays.deepToString(seats));
    }
}