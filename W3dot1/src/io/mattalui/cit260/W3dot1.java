package io.mattalui.cit260;

import java.util.Scanner;

public class W3dot1 {
    /**
     * Write a short Java program that does the following:
     * 1) Tells the user what the program does.
     * 2) Prompts the user to enter a value for today's day of the week (0 for
     *    Sunday, 1, for Monday, etc. ).
     * 3) Gets the user's input and saves it. If the value is less than 0 or
     *    greater than 6, tell the user the input is invalid, and terminate the
     *    program.
     * 4) Prompts the user to enter some number of days in the future. This can
     *    be any non-negative value.
     * 6) Gets the user's input and saves it. If the value is negative, tell the
     *    user the input is invalid and terminate the program.
     * 7) Calculates the day of the week for the future day.
     * 8) Displays the day of the week for today and the day of the week for the
     *    future day.
     * 9) Outputs a goodbye message.
     *
     * @param args
     */
    public static void main(String[] args) {
        displayIntro();
        int todayNum = promptUser("Enter today's day of the week (0 for Sunday, 1 for Monday, etc):");
        if (!checkValidDay((todayNum))){
            System.out.println("\n" + todayNum + " is invalid. You must choose a number 0 through 6.");
            return;
        }
        int nextNum = promptUser("Enter the number of days in the future:");
        if(!checkPositiveNumber(nextNum)){
            System.out.println("\n" + nextNum + " is invalid. You must choose a positive number.");
            return;
        }
        displayDayChange(todayNum, nextNum);
        sayGoodbye();
    }

    /**
     * Displays a brief message to the user that explains the program.
     */
    public static void displayIntro(){
        System.out.println("Given today's day of the week and some number of days in the future");
        System.out.println("this program will tell you the day of the week for the future day.");
    }

    /**
     * Prompts a user using a given message and returns their int input
     *
     * @param message the message to display to the user
     * @return the int inputted by the user
     */
    public static int promptUser(String message){
        Scanner input = new Scanner(System.in);
        System.out.print(message + " ");

        return input.nextInt();
    }

    /**
     * Checks whether or not a given number is positive
     * @param num a number to check
     * @return whether or not a number is positive
     */
    public static boolean checkPositiveNumber(int num){
        return num >= 0;
    }

    /**
     * Checks whether or not a number is a valid day number i.e 0-6
     *
     * @param dayNum number of day to check
     * @return whether or not a number is a valid day number
     */
    public static boolean checkValidDay(int dayNum) {
        return dayNum < 7 && checkPositiveNumber(dayNum);
    }

    /**
     * Displays the day change to the user in a human-readable way
     *
     * @param todayNum
     * @param nextNum
     */
    public static void displayDayChange(int todayNum, int nextNum){
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String today = days[todayNum];
        String futureDay = days[(todayNum + nextNum) % 7];
        System.out.println("Today is " + today + " and the future day is " + futureDay + ".");
    }

    /**
     * That's all, folks!
     */
    public static void sayGoodbye(){
        System.out.println("Goodbye.");
    }
}
