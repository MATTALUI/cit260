package io.mattalui.cit260;

public class W6dot2 {
    /**
     * Write a short Java program that contains the following two methods:
     * 1) public static double celsiusToFahrenheit(double tempCelsius)
     * 2) public static double fahrenheitToCelsius(double tempFahrenheit)
     *
     * Your program should:
     * 1) Tell the user what the program does.
     * 2) Invoke the above two methods to compute and display the table shown below.
     * 3) Output a goodbye message.
     *
     * @param args
     */
    public static void main(String[] args) {
        displayConversionTable();
	    sayGoodbye();
    }

    /**
     * Disyplays a two-sided Fahrenheit-Celsius conversion to the user
     */
    public static void displayConversionTable() {
        double leftCelsius = 40.0; // The starting celsius value for the left side of the table
        double rightFahrenheit = 120; // The starting fahrenheit  for the right side of the table

        // These modifiers define how much to change the temperature each time
        final double celsiusModifier = 1.0;
        final double fahrenheitModifier = 10;
        // We want ten rows; this is AC from the assignment
        final int desiredRows = 10;

        System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\t\tCelsius");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < desiredRows; i++) {
            double leftFahrenheit = celsiusToFahrenheit(leftCelsius);
            double rightCelsius = fahrenheitToCelsius(rightFahrenheit);

            System.out.format(
                    "%.1f\t\t%.1f\t\t|\t%.1f\t\t\t%.2f\n",
                    leftCelsius,
                    leftFahrenheit,
                    rightFahrenheit,
                    rightCelsius
            );
            leftCelsius -= celsiusModifier;
            rightFahrenheit -= fahrenheitModifier;
        }
    }

    /**
     * Converts a celsius temperature to a fahrenheit temperature using the
     * conversion equation:
     *
     * F = (celsius * (9/5)) + 32
     *
     * @param tempCelsius the celsius temperature to convert
     * @return the fahrenheit equivalent
     */
    public static double celsiusToFahrenheit(double tempCelsius) {
        double fahrenheit = tempCelsius * (9.0 /5.0) + 32; // These "magic"s are just part of the equation...

        return fahrenheit;
    }

    /**
     * Converts a fahrenheit temperature to a celsius temperature using the
     * conversion equation:
     *
     * C = (F + 32)/(9/5)
     *
     * @param tempFahrenheit
     * @return
     */
    public static double fahrenheitToCelsius(double tempFahrenheit) {
        double celsius = (tempFahrenheit - 32)/(9.0/5.0); // These "magic"s are just part of the equation...

        return celsius;
    }

    /**
     * "Catch you guys on the flippity flip."
     *      ~Michael Scott
     */
    public static void sayGoodbye(){
        System.out.println("\nGoodbye");
    }
}
