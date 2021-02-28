package io.mattalui.cit260;

import java.util.Scanner;

/**
 * @author Matthew Hummer
 */
public class W9 {
    /**
     * write the code for your MyPoint class and a main() method that does the
     * following:
     *
     * 1) Tells the user what the program does.
     * 2) Uses the no-arg constructor to create a MyPoint object p1 at (0,0).
     * 3) Prompts the user to enter the x and y coordinates of a point.
     * 4) Saves the users input.
     * 5) Uses the first distance method to calculate and display the distance
     *    between the MyPoint object p1 and the point at the x and y coordinates
     *    entered by the user. The distance is displayed with two digits after
     *    the decimal point.
     * 6) Uses the parameterized constructor to create a MyPoint object p2
     *    using the x-coordinate and the y-coordinate entered  by the user.
     * 7) Uses the second and third distance methods to calculate and display
     *    the distance between the MyPoint object p1 and the MyPoint object p2.
     *    The distance is displayed with two digits after the decimal point.
     * 8) Displays a goodbye message.
     *
     * @param args
     */
    public static void main(String[] args) {
	    displayIntro();
	    int x = promptPoint("Enter the x coordinate of a point");
        int y = promptPoint("Enter the y coordinate of a point");

        Point def = new Point();
        Point custom = new Point(x, y);

        double[] values = {
                custom.distance(def.getX(), def.getY()),
                custom.distance(def),
                Point.distance(def, custom)
        };

        for (int i = 0; i < values.length; i++){
            System.out.format(
                    "Using method %d, the distance from %s to %s is %.2f\n",
                    i + 1,
                    def.toString(),
                    custom.toString(),
                    values[i]
            );
        }

        sayGoodbye();
    }

    /**
     * Prompts the user for the value of a point using provided message
     *
     * @param msg a quick message to display
     * @return the value entered by the user
     */
    public static int promptPoint(String msg){
        Scanner input = new Scanner(System.in);
        System.out.print(msg + ": ");

        return input.nextInt();
    }

    /**
     * Displays an introduction to the program in a user-friendly way
     */
    public static void displayIntro() {
        System.out.println("This program creates a point at (0,0) and a point at the coordinates");
        System.out.println("entered by you. It then computes and displays the distance from (0,0)");
        System.out.println("to the point defined by you, using three different methods.");
    }

    /**
     * “For once I’m stuck without a punchline.”
     *      ~The Joker
     */
    public static void sayGoodbye(){
        System.out.println("Goodbye...");
    }
}
