package io.mattalui.cit260;

import java.util.Scanner;

public class W2dot2 {

    /**
     * Write a short Java program that does the following:
     *
     * 1) Tells the user what the program does.
     * 2) Prompts the user to enter a value for the cost of their meal.
     * 3) Gets the user's input and saves it in a variable declared as a double.
     * 4) Prompts the user to enter a percentage value for the tip.
     * 5) Gets the user's input and saves it in a variable declared as a double.
     * 6) Calculates the value of the tip, using the percentage entered by the user.
     * 7) Calculates the tax on the meal. The tax rate is 3.2%.
     * 8) Calculates the total bill = meal cost + tip + tax.
     * 9) Outputs the tip, the tax, and the total value of the bill. All values
     *    will be formatted to show a dollar sign and 2 digits after
     *    the decimal point.
     * Outputs a goodbye message.
     *
     * @param args
     */
    public static void main(String[] args) {
	    displayIntro();
	    double bill = promptUser("Enter the cost of the meal:");
	    double tipPercent = promptUser("Enter the tip percentage:");
	    double tipAmount = calculateTip(bill, tipPercent);
	    double taxAmount = calculateTax(bill);
	    double total = calculateTotal(bill, tipAmount, taxAmount);
	    displayExpenses(tipAmount, taxAmount, total);
	    sayGoodbye();
    }

    /**
     * Displays a quick program intro message to the user
     */
    public static void displayIntro(){
        System.out.println("Given the price of a meal and a percentage to use for the tip,");
        System.out.println("this program calculates the tip, the tax, and the total amount of the bill.");
    }

    /**
     * Prompts the user for a number using a message that is provided
     *
     * @param message the message to be displayed to a user
     * @return the number that the user entered in response to the message
     */
    public static double promptUser(String message){
        Scanner input = new Scanner(System.in);
        System.out.print(message + " ");

        return input.nextDouble();
    }

    /**
     * Calculates the tax amount for a bill
     *
     * @param bill the amount of the base bill price
     * @return the amount of tax to be charged for a given base bill
     */
    public static double calculateTax(double bill){
        return bill * 0.032; // multiply by tax rate of 3.2%
    }

    /**
     * Calculates the tip amount based on the base bill price and the tip percent
     *
     * @param bill the base cost of the bill
     * @param tip the amount tip to be applied to the bill
     * @return the tip amount for a bill based on base and tip percentage
     */
    public static double calculateTip(double bill, double tip){
        double percent = tip / 100.0;

        return bill * percent;
    }

    /**
     * Calculates the total amount of expenses
     *
     * @param bill the base amount of the bill
     * @param tip the amount of money spent on an extra tip
     * @param tax the amount of money spen on tax costs
     * @return the total for the base, tip, and tax amounts
     */
    public static double calculateTotal(double bill, double tip, double tax){
        return bill + tip + tax;
    }

    /**
     * Displays all of the expenses in an itemized list
     *
     * @param tip the amount spent on the extra tip
     * @param tax the amount spent on tax costs
     * @param total the total amount of money spent on the whole bill
     */
    public static void displayExpenses(double tip, double tax, double total){
        System.out.println("\nThe tip is $" + String.format("%.2f", tip));
        System.out.println("The tax is $" + String.format("%.2f", tax));
        System.out.println("The total bill is $" + String.format("%.2f", total));
    }

    /**
     * Says goodbye! That's it!
     */
    public static void sayGoodbye(){
        System.out.println("Goodbye.");
    }
}
