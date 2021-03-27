package io.mattalui.cit260;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Matthew Hummer
 */
public class W13 {

    /**
     * Your main( ) method must do the following:
     * 1) Tell the user what the program does.
     * 2) Create the following objects and store the references to them in a
     *    single ArrayList.
     * 3) A Circle object at point (1,1) with a radius of 10 inches and an
     *    identifier of 156
     * 4) A Square object at point (1,3) with a side of 2 inches and an
     *    identifier of 237
     * 5) A  Right Triangle at point (3,3) with a height of 3 inches, a base of
     *    4 inches and an identifier of 212
     * 6) Create a text file and write the data for each object to the file.
     *    Handle any IO exceptions.
     * 7) Read the data from the file back into your program. Handle any IO
     *    Exceptions.
     * 8) Using the data you just read from the file, display a report.
     */
    public static void main(String[] args) {
        System.out.println("This program creates a series of shapes.");
        System.out.println("It will write those shapes to a file, read them from a file.\n");

        final String filePath = "./w13-data.cats";
        ShapeDataFileManager manager = new ShapeDataFileManager(filePath);

        List<Shape> oldShapes = new ArrayList<Shape>();
        oldShapes.add(new Circle(156, new Point(1, 1), 10.0));
        oldShapes.add(new Square(237, new Point(1, 3), 2.0));
        oldShapes.add(new Triangle(212, new Point(3, 3), 3.0, 4.0));

        if (!manager.writeToFile(oldShapes)) {
            System.out.println("Oh no! Something went wrong!");
            return;
        }

        List<Shape> newShapes = manager.parseFile();
        System.out.println("Shape     ID   Position  Area");
        for (Shape shape : newShapes) {
            shape.display();
        }

        System.out.println("\nGoodbye...");
    }
}
