package io.mattalui.cit260;

import java.util.Scanner;

/**
 * Week 7.2 assignment
 *
 * @author Matthew Hummer
 */
public class W7dot2 {
    /**
     * Write a program that:
     * 1) Tells the use what the program does.
     * 2) Prompts the user to enter five numbers.
     * 3) Saves the user's input in an array of doubles.
     * 4) Uses the methods above to compute the mean and the standard deviation
     *    for the numbers in the array.
     * 5) Displays the mean and the standard deviation with 2 digits after the
     *    decimal point.
     * 6) Displays a goodbye message.
     * 7) Your file should have the proper file prologue, and each method
     *    should have the proper method prologue.
     *
     * @param args
     */
    public static void main(String[] args) {
        int desiredNumberOfNumbers = 5;
        double[] numbers = new double[desiredNumberOfNumbers];
        for (int i = 0; i < desiredNumberOfNumbers; i++){
            numbers[i] = promptDouble();
        }
        double average = average(numbers);
        double std = standardDeviation(numbers);
        System.out.format("The mean of this set of numbers is %.2f\n", average);
        System.out.format("The standard deviation is %.2f\n", std);
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
     * Calculates the standard deviation for a sample set
     *
     * @param array the numbers od the sample set
     * @return the standard deviation for a sample set
     */
    public static double standardDeviation(double[] array) {
        double standardDeviation = 0;
        double average = average(array);

        double[] deviations = new double[array.length];
        for (int i = 0; i < array.length; i++){
             deviations[i] = Math.pow(array[i] - average, 2);
        }

        double averageDeviation = 0;
        for (double deviation : deviations) averageDeviation += deviation;
        averageDeviation = averageDeviation / (deviations.length - 1);
        standardDeviation = Math.sqrt(averageDeviation);

        return standardDeviation;
    }

    /**
     * Displays a brief explanation of the program to the user
     */
    public static void displayIntro() {
        System.out.println("This program computes the mean and the standard deviation for a set of numbers.");
    }

    /**
     * Honestly, this guy should be pretty self-explanatory
     */
    public static void sayGoodbye(){
        System.out.println("Goodbye...");
    }
}
