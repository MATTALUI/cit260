package io.mattalui.cit260;

/**
 * @author Matthew Hummer
 */
public class W10 {

    /**
     * Your main( ) method should:
     *
     * 1) Tells the user what the program does.
     * 2) Prompts the user to enter the values for the sides, color, and filled
     *    attribute for a triangle object.
     * 3) Saves the users input.
     * 4) Using the values entered by the user, creates the Triangle object.
     * 5) Displays the string representation of the Triangle object by calling
     *    its toString( ) method. Look at the output example below to see what
     *    this output should look like.
     * 6) Displays a goodbye message.
     *
     * @param args
     */
    public static void main(String[] args) {
        displayIntro();

        Triangle triangle = new Triangle();
        triangle.buildFromUserInput();

        System.out.println("\n" + triangle.toString());

        sayGoodbye();

    }

    /**
     * Displays a brief, user-friendly description of the program
     */
    public static void displayIntro(){
        System.out.println("This program gets input for a triangle from the user.");
        System.out.println("It then creates a Triangle object and displays its description.\n");
    }

    /**
     * It just says goodbye! Duh!
     */
    public static void sayGoodbye(){
        System.out.println("\nGoodbye...");
    }
}
