package io.mattalui.cit260;

public class W5dot1 {
    /**
     * Write a short Java program that does the following:
     *
     * 1) Tells the user what the program does.
     * 2) Uses a loop to calculate pounds per kilogram (1 kilogram = 2.2 pounds) and display the following table.
     * 3) Outputs a goodbye message.
     * @param args
     */
    public static void main(String[] args) {
        displayIntro();
	    displayConversions();
        sayGoodBye();
    }

    /**
     * Displays an introduction
     */
    public static void displayIntro(){
        System.out.println("This Program displays a table of kilogram to punds conversions.\n");
    }

    /**
     * Displays pounds to kilograms tables for 1-15 kilograms
     */
    public static void displayConversions() {
        System.out.println("kilograms\tpounds");
        System.out.println("---------\t------");
        int kiloLimit = 15; // Only expect 1-15 in output
        for (int kilo = 1; kilo <= kiloLimit; kilo++){
            float lbsPerKilo = 2.2f; // 1 kilogram = 2.2 pound
            float lbs = kilo * lbsPerKilo;
            System.out.format("%d\t\t\t%.1f\n", kilo, lbs);
        }
    }

    /**
     * I don't know why you say, "Goodbye", I say, "Hello"
     */
    public static void sayGoodBye(){
        System.out.println("\nGoodbye.");
    }
}
