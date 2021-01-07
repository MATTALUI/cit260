package io.mattalui.cit260;

import java.util.Scanner;

public class W3dot2 {
    /**
     * Write a short Java program that does the following:
     * 1) Tells the user what the program does.
     * 2) Prompts the user to enter a year.
     * 3) Gets the user's input and saves it.
     * 4) Prompts the user to enter a value for the month(1 = Jan, 2 = Feb, etc).
     * 5) Gets the user's input and saves it. If the value is is not between 1
     *    and 12 inclusive, tell the user and terminate the program.
     * 6) Calculates the number of days in that month. Your program should
     *    correctly handle leap years (see listing 3.7 in the textbook).
     * 7) Displays the number of days in that month.
     * 8) Outputs a goodbye message.
     * @param args
     */
    public static void main(String[] args) {
        displayIntro();
        int year = promptUser("Enter a year: ");
        int month = promptUser("Enter a value for the month(1 = Jan, 2 = Feb, etc): ");
        System.out.println();
        if (!checkValidMonth(month)) {
            System.out.print(month);
            System.out.println(" is invalid. Month values must be between between 1 and 12, inclusive.");
        } else {
            int days = calculateDays(year, month);
            displayMonthDays(year, month, days);
        }
        sayGoodbye();
    }

    /**
     * Displays a brief explanation of the program to the user
     */
    public static void displayIntro() {
        System.out.println("Given a year and a month in that year, this program will tell you");
        System.out.println("the number of days in that month.");
    }

    /**
     * Prompts the user using a given message and returns an int
     *
     * @param message the meassage that is to be displayed to the user
     * @return the number inputted in response to the message
     */
    public static int promptUser(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);

        return input.nextInt();
    }

    /**
     * Checks whether or not a month nuber is valid (I.E. 1-12)
     *
     * @param month the month number to check
     * @return whether or not a month is valid, being between 1 and 12
     */
    public static boolean checkValidMonth(int month) {
        return month > 0 && month < 13;
    }

    /**
     * checks whether or not a year is a leap year
     * https://docs.microsoft.com/en-us/office/troubleshoot/excel/determine-a-leap-year
     * Next leap year: 2024
     *
     * @param year the year that is being determined as leap or not
     * @return whether or not the provided year is a leap year
     */
    public static boolean checkLeapYear(int year) {
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }

        return isLeap;
    }

    /**
     * calculates the number of days in a month
     *
     * @param year the year the month belongs to, needed for leap year
     * @param month the month to check the number of days in
     * @return the number of days in the month
     */
    public static int calculateDays(int year, int month) {
        boolean isFebruary = month == 2;
        if (isFebruary && checkLeapYear(year)) {
            return 29; // February of leap year has the 29 days
        }
        int[] monthLengths = {
                31,
                28,
                31,
                30,
                31,
                30,
                31,
                31,
                30,
                31,
                30,
                31
        };

        return monthLengths[month - 1];
    }

    /**
     * Displays the month, year, and the numebr of days in the month in a
     * user-friendly format
     *
     * @param year the year to be outputted
     * @param month  the month to be outputted
     * @param days the number of days in the month to be outputted
     */
    public static void displayMonthDays(int year, int month, int days) {
        String[] months = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };
        String monthName = months[month - 1];
        System.out.format("%s of %d has %d days in it.\n", monthName, year, days);
    }

    /**
     * Goodbye, old friend...
     */
    public static void sayGoodbye() {
        System.out.println("Goodbye.");
    }
}