package io.mattalui.cit260;

import java.util.Scanner;

public class W2dot1 {
    /**
     * Write a short Java program that does the following:
     *
     * 1) Tells the user what the program does.
     * 2) Prompts the user to enter a temperature in degrees Celsius.
     * 3) Gets the user's input and saves it in a variable declared as a double.
     * 4) Converts the Celsius temperature to a temperature in degrees
     *    Fahrenheit, using the formula:  tempf = (9.0/5.0) x tempc+ 32
     * 5) Outputs the Celsius temperature and the Fahrenheit temperature, with
     *    2 digits after the decimal point.
     * 6) Outputs a goodbye message.
     * @param args
     */
    public static void main(String[] args) {
        displayPrompt();
        double celsius = getUserInputCelsius();
        double fahrenheit = calculateFahrenheit(celsius);
        displayConversion(celsius, fahrenheit);
        sayGoodbye();
    }

    /**
     * Displays a brief message explaining the program and prompting the user
     * for their input
     */
    private static void displayPrompt() {
        System.out.println("This program converts a temperature in degrees Celsius into");
        System.out.println("a temperature in degrees Fahrenheit. Enter a temperature in");
        System.out.print("degrees Celsius: ");
    }

    /**
     * Collects celsius temperature fom user and returns it as a double
     *
     * @return the celsius temperature to be used in the conversion
     */
    private static double getUserInputCelsius() {
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();

        return celsius;
    }

    /**
     * Converts a temperature in celsius to a temperature in fahrenheit
     *
     * @param celsius the celsius temperature to convert to fahrenheit
     * @return the fahrenheit equivalent of the supplied celsius value
     */
    private static double calculateFahrenheit(double celsius) {
        double farenheit = (9.0 / 5.0) * celsius + 32.0;

        return farenheit;
    }

    /**
     * Formats converted temperature values and displays them to the user
     *
     * @param celsius temperature in celsius to be outputted
     * @param fahrenheit temperature in celsius to be outputted
     */
    private static void displayConversion(double celsius, double fahrenheit) {
        String celsiusOutput = String.format("%.2f", celsius);
        String fahrenheitOutput = String.format("%.2f", fahrenheit);
        System.out.println("\n" + celsiusOutput + " degrees Celsius is equal to " + fahrenheitOutput + " degrees Fahrenheit.");
    }

    /**
     * Prints out the word "Goodbye". I promise it's not as ominous as it could sound...
     */
    private static void sayGoodbye() {
        System.out.println("Goodbye.");
    }
}