package io.mattalui.cit260;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Matthew Hummer
 */
public class W12 {

    /**
     * Your program must do the following:
     * 1) Tell the user what the program does.
     * 2) Create the following objects and store the references to them in a
     *    single ArrayList.
     *      - A Circle object with a radius of 10 inches and an identifier of
     *        156.
     *      - A Square object with a side of 2 inches and an identifier of 237.
     *      - A  Right Triangle with a height of 3 inches, a base of 4 inches
     *        and an identifier of 212.
     * 3) Iterate through the ArrayList and display the area of the three
     *    different shape objects you have created.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("This program creates a series of shapes then shows their ID with their area.\n");

        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(156, 10.0));
        shapes.add(new Square(237, 2.0));
        shapes.add(new Triangle(212, 3.0, 4.0));

        System.out.println("Identifier\t\tArea");
        for (Shape shape : shapes) {
            shape.display();
        }

        System.out.println("\nGoodbye...");
    }
}
