package io.mattalui.cit260;

public class W5dot2 {
    /**
     * Write a short Java program that does the following:
     *
     * 1) Tells the user what the program does.
     * 2) Uses a loop to display a table of all of the numbers from 100 to 1000
     *    that are divisible by both 5 and 6. The numbers must be separated by
     *    exactly one space and there must be 10 numbers per line.
     * 3) Displays a goodbye message.
     *
     * @param args
     */
    public static void main(String[] args) {
        displayIntro();
        displayMultiplesTable();
        sayGoodbye();
    }

    /**
     * Displays a brief explanation of what the program does to the user.
     */
    public static void displayIntro() {
        System.out.println("This program displays all of the numbers from 100 to 1000");
        System.out.println("that are divisible by both 5 and 6.\n");
    }

    /**
     * Displays numbers between 100 and 1000 that are evenly divisible by 6 and 5.
     * There should be a single space between numbers and 10 numbers per line.
     */
    public static void displayMultiplesTable() {
        int numbersPerLine = 10;
        int displayedNumbers = 0;
        int startNumber = 100;
        int maxNumber = 1000;
        for (int number = startNumber; number < maxNumber; number++) {
            if (number % 5 == 0 && number % 6 == 0) {
                System.out.print(number + " ");
                displayedNumbers++;
                if (displayedNumbers == numbersPerLine) {
                    System.out.print("\n");
                    displayedNumbers = 0;
                }
            }
        }
    }

    /**
     * All be bach...
     */
    public static void sayGoodbye() {
        System.out.println("\nGoodbye.");
    }
}