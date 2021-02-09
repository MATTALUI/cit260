package io.mattalui.cit260;

import java.util.Scanner;

public class Main {
    /**
     * Write a short Java program that does the following:
     *
     * 1) Tells the user what the program does.
     * 2) Prompts the user to an investment amount, for example, 1000.
     * 3) Gets the user's input and saves it. If the user's input is not a
     *    positive, non-zero value, display an error message, then loop back
     *    and prompt for a new value. Stay in this loop until you have a valid
     *    value.
     * 4) Prompts the user to enter an annual interest rate between 0 and 100.
     *    For example, 9 would be 9%.
     * 5) Gets the user's input and saves it. If the user's input is not positive
     *    or if it is greater than 100, display an error message, then loop back
     *    and prompt for a new value. Stay in this loop until you have a valid
     *    value.
     * 6) Using a method that you have written, calculate and display the future
     *    value of the investment for a period of 10 years.
     *    The formula for computing the future value of an investment is:
     *
     *    futureValue = investmentAmount x (1 + monthlyInterestRate)^(numberOfYears * 12)
     *
     * @param args
     */
    public static void main(String[] args) {
        displayIntro();
        double investmentAmount = getInvestmentAmount();
        double interestPercent = getInterestPercent();
        displayInvestmentTable(investmentAmount, interestPercent);
        sayGoodbye();
    }

    /**
     *  prompts the user for an initial investment amount until a positive, non-zero
     *  amount is entered.
     *
     * @return positive, non-zero amount representing investment principle
     */
    public static double getInvestmentAmount() {
        double investmentAmount = 0;  // Initialize to 0 just to start out; the user will change (maybe)
        boolean displayError = false;
        do {
            if (displayError) {
                System.out.println("\nInvestment amount must be positive, non-zero number.");
            }
            investmentAmount = getDouble("Enter the a positive, non-zero value for the investment");
            displayError = true;
        } while (investmentAmount <= 0);

        return investmentAmount;
    }

    /**
     * Prompts the user for the ANNUAL percentage rate to be used in calculating
     * compound interest.
     *
     * @return decimal representing percentage to be used
     */
    public static double getInterestPercent() {
        double interestPercent = 0; // Initialize to 0 just to start out; the user will change (maybe)
        boolean displayError = false;
        do {
            if (displayError) {
                System.out.println("\nInterest amount must be positive, non-zero number between 1 and 100.");
            }
            interestPercent = getDouble("Enter an annual interest rate, between 0 and 100");
            displayError = true;
        } while (interestPercent <= 0 || interestPercent > 100);

        return interestPercent;
    }

    /**
     * prompts a user for a number and returns it
     *
     * @param message a short message to display to the user as a prompt
     * @returnthe value of the number that the user inputs
     */
    public static double getDouble(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message + ": ");

        return input.nextDouble();
    }

    /**
     * Displays a short, user-friendly epxplanation of the program.
     */
    public static void displayIntro(){
        System.out.println("Given an investment amount and an annual interest rate, this program ");
        System.out.println("will calculate the future value of the investment for a period of");
        System.out.println("ten years.\n");
    }

    /**
     * "...what can I say more?"
     *      ~ Jacob 6:12
     */
    public static void sayGoodbye() {
        System.out.println("\nGoodbye.");
    }

    /**
     * Iterates over the next ten years and calculates future values using the
     * user-provided principal amount and the interest rate percentage
     *
     * @param investmentAmount number representing the principal investment
     * @param interestRatePercent annual percentage
     */
    public static void displayInvestmentTable(double investmentAmount, double interestRatePercent) {
        int currentYear = 1;
        int stopYear = 10;
        System.out.format("\nYears\tFuture Value\n");
        while (currentYear <= stopYear) {
            double futureValue = futureValue(investmentAmount, interestRatePercent, currentYear);
            System.out.format("%d\t\t$%.2f\n", currentYear, futureValue);
            currentYear++;
        }
    }

    /**
     * calculates the future value of an investment based on principal,
     * interest rate, and  change in years
     * futureValue = investmentAmount x (1 + monthlyInterestRate)^(numberOfYears * 12)
     *
     * @param investmentAmount the initial investment amount
     * @param interestRate the interest rate of the investment
     * @param years the amount of elapsed years for a future value
     * @return the future value of the investment
     */
    public static double futureValue(double investmentAmount, double interestRate, int years){
        double monthsInAYear = 12;
        double totalMonths = monthsInAYear * years;
        double rateDecimal = interestRate / 100;
        double growthRate = 1 + (rateDecimal / monthsInAYear);
        double compoundGrowth = Math.pow(growthRate, totalMonths);

        return investmentAmount * compoundGrowth;
    }
}
