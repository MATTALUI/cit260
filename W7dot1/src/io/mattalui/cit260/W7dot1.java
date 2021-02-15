package io.mattalui.cit260;

import java.util.Scanner;

/**
 * Week 7.1 assignment
 *
 * @author Matthew Hummer
 */
public class W7dot1 {
    /**
     * Write a method that calculates and returns the average value for an
     * array of doubles. The method header will look like the following:
     *
     * public static double average(double[ ] array)
     *
     * Then write a main( ) method that does the following:
     *
     * 1) Tells the user what the program does.
     * 2) Prompts the user to enter 5 double values.
     * 3) Stores these values in an array.
     * 4) Calls the average method you wrote to calculate and return the average
     *    value of the numbers in the array.
     * 5) Displays the average value, with two digits after the decimal point.
     * 6) Displays a goodbye message.
     * @param args
     */
    public static void main(String[] args) {
        int desiredNumberOfNumbers = 5;
        double[] numbers = new double[desiredNumberOfNumbers];
        for (int i = 0; i < desiredNumberOfNumbers; i++){
            numbers[i] = promptDouble();
        }
        double average = average(numbers);
        System.out.format("The average of these five numbers is %.2f\n",average);
        sayGoodbye();
    }

    /**
     * Prompts the user for a number and returns it
     *
     * @return the number inputted by the user
     */
    public static double promptDouble() {
        System.out.print("Please enter a number: ");

        return new Scanner(System.in).nextDouble();
    }

    /**
     * Calculates the average from an an array of numbers
     *
     * @param array the list of numbers to have averaged
     * @return the average of all of the numbers in the list
     */
    public static double average(double[] array) {
        double total = 0;
        for (double num : array) total += num;

        return total / array.length;
    }

    /**
     * Displays a brief explanation of the program to the user
     */
    public static void displayIntro() {
        System.out.println("This program calculates the average of five numbers.");
    }

    /**
     * Honestly, this guy should be pretty self-explanatory
     */
    public static void sayGoodbye(){
        System.out.println("Goodbye...");
    }
}
