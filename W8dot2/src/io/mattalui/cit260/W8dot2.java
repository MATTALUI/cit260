package io.mattalui.cit260;

import java.util.Date;

/**
 * @author Matthew Hummer
 */
public class W8dot2 {
    /**
     * Write a short Java program that does the following:*
     * 1) Tells the user what the program does.
     * 2) Using the Date class (described in section 9.6.1 of the textbook) Create
     *    a Date object and set it's elapsed time to 10000, 100000, 1000000, 10000000,
     *    100000000, 1000000000, and 10000000000 and displays the data and time using
     *    the toString( ) method, respectively.
     * 3) Display a goodbye message.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("This program uses the Date class to display a set of dates and times.\n");

        int powerBase = 10; // all target numbers are 10^n
        int startPower = 4; // Start at 10000
        int stopPower = 10; // Stop at 10000000000
        for (int i = startPower; i <= stopPower; i++) {
            long targetDateNumber = Double.valueOf(Math.pow(powerBase, i)).longValue();
            Date date = new Date();
            date.setTime(targetDateNumber);
            System.out.println(date.toString());
        }

        sayGoodbye();
    }

    /**
     *
     */
    public static void sayGoodbye() {
        System.out.println("\nGoodbye...");
    }
}


