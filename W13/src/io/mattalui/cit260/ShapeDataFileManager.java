package io.mattalui.cit260;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeDataFileManager {
    static final int ClassnameIndex = 0;
    static final int IdIndex = 1;
    static final int XIndex = 2;
    static final int YIndex = 3;
    static final int Data1Index = 4;
    static final int Data2Index = 5;

    private String filePath;

    /**
     * Constructor creates a file manager based off of the provided file path
     *
     * @param filePath the filepath for the shape data that has been stored
     */
    public ShapeDataFileManager(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Writes a list of shapes to a file that can be parsed
     *
     * @param shapes the shapes that should be written to a file
     * @return a boolean representing whther or not the write was successful
     */
    public boolean writeToFile(List<Shape> shapes) {
        try {
            FileWriter writer = new FileWriter(filePath);
            for (Shape shape : shapes) {
                writer.write(shape.toParsableRow() + "\n");
            }
            writer.close();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Reads the from the filePath, parses the data, and returns the shapes in
     * the file
     * @return the shapes in the file
     */
    public List<Shape> parseFile() {
        List<Shape> shapes = new ArrayList<Shape>();
        try {
            File file = new File(this.filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");
                String className = line[0];
                int id = Integer.parseInt(line[1]);
                int x = Integer.parseInt(line[2]);
                int y = Integer.parseInt(line[3]);
                double data1 = Double.parseDouble(line[4]);
                Point point = new Point(x, y);
                Class<?> classType = Class.forName(className);


                if (className.equals("io.mattalui.cit260.Triangle")) {
                    Constructor constructor = classType.getConstructor(int.class, Point.class, double.class, double.class);
                    shapes.add((Shape)constructor.newInstance(id, point, data1, Double.parseDouble(line[5])));
                } else {
                    Constructor constructor = classType.getConstructor(int.class, Point.class, double.class);
                    shapes.add((Shape)constructor.newInstance(id, point, data1));
                }
            }
        } catch(Exception e) {
            System.out.println("Error!");
            e.printStackTrace();
            return shapes;
        }

        return shapes;
    }
}
