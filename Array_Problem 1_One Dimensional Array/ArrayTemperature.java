// Ito ang class ng program natin
public class ArrayTemperature {

    // Ito ang main method, dito naguumpisang tumakbo ang program
    public static void main(String[] args) {

        // Nag deklara at gumawa ako ng double array na may pangalang temperatures, na mayroong 5 na laman (para sa 5 na araw)
        double[] temperatures = new double[5];

        temperatures[0] = 32.5;     // Inilagay ko ang 32.5 sa unang element (index 0), ito yung Day 1

        temperatures[1] = 34.0;     // Inilagay ko ang 34.0 sa pangalawang element (index 1), Day 2

        temperatures[2] = 31.8;     // Inilagay ko ang 31.8 sa pangatlong element (index 2), Day 3

        temperatures[3] = 33.2;     // Inilagay ko ang 33.2 sa pang-apat na element (index 3), Day 4

        temperatures[4] = 35.1;     // Inilagay ko ang 35.1 sa panlimang element (index 4), Day 5

        // Nag print ako ng title para malaman kung ano ang lalabas sa console
        System.out.println("Daily Temperatures:");

        // Standard for loop: magsisimula ang index sa 0, uulit hanggang 4 (kasi 5 ang length), at magdadagdag ng isa bawat ikot
        for (int i = 0; i < temperatures.length; i++) {

            // I-print ang bawat day at temperature, nilagyan ko ng +1 ang i para Day 1 ang simula at hindi Day 0
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
        }

        temperatures[2] = 32.0;     // Pinalitan ko ang element sa index 2 (Day 3), mula 31.8 ito ay naging 32.0

        // Nag-print ako ng bagong value ng element sa index 2 para makita na nagbago siya
        System.out.println("Updated temperature for Day 3: " + temperatures[2]);
    }
}