package io.mattalui.cit260;

/**
 * @author Matthew Hummer
 */
public class W8dot1 {

    /**
     * Write a short Java program that implements your Rectangle class, and a
     * main() method that does the following:
     * 1) Tells the user what the program does.
     * 2) Creates two Rectangle objects, the first with a height of 4 and a
     *    width of 40, the second with a height of 3.5 and a width of 5.
     * 3) Call the methods in your Rectangle class to output the width, height,
     *    area, and perimeter of each rectangle, with 2 digits after the decimal point.
     * 4) Output a goodbye message.
     *
     * @param args
     */
    public static void main(String[] args) {
	    // Tells the user what the progam does
        System.out.println("This program creates two rectangle objects and displays their width, height, area and perimeter.");

        // Creates two rectangle objects...
        // ...the first with height of 4 and with of 40
        float desiredHeight1 = 4.0f;
        float desiredWidth1 = 40.0f;
        Rectangle r1 = new Rectangle();
        r1.setHeight(desiredHeight1);
        r1.setWidth(desiredWidth1);

        // ...the second with height of 3.5 and width of 5
        float desiredHeight2 = 3.5f;
        float desiredWidth2 = 5.0f;
        Rectangle r2 = new Rectangle(desiredHeight2, desiredWidth2);

        // Display their information
        System.out.println("\nRectangle 1:");
        r1.printData();
        System.out.println("\nRectangle 2:");
        r2.printData();

        // Output a goodbye message.
        sayGoodbye();
    }

    /**
     * So long, farewell, auf Wiedersehen, good night!
     */
    public static void sayGoodbye() {
        System.out.println("\nGoodbye...");
    }
}
