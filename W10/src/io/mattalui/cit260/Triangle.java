package io.mattalui.cit260;

import java.util.Scanner;

/**
 * @author Matthew Hummer
 */
public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    /**
     * Default constructor creates a Triangle using the default values
     */
    public Triangle () {
        super();
        this.setSide1(1);
        this.setSide2(1);
        this.setSide3(1);
    }

    /**
     * Creates a Triangle using the values provided
     *
     * @param s1 the length of side 1
     * @param s2 the length of side 2
     * @param s3 the length of side 3
     * @param color the color of the Triangle
     * @param filled whether or not the Triangle is filled
     */
    public Triangle (double s1, double s2, double s3, String color, boolean filled) {
        super(color, filled);
        this.setSide1(s1);
        this.setSide2(s2);
        this.setSide3(s3);
    }

    /**
     * Creates a string representation of the Triangle
     * @return a string representation of the Triangle
     */
    @Override
    public String toString() {
        return String.format (
                "side1 = %.2f, side2 = %.2f, side3 = %.2f\n%s\nArea = %.2f",
                this.getSide1(),
                this.getSide2(),
                this.getSide3(),
                super.toString(),
                this.getArea()
        );
    }

    /**
     * Gets the length of side 1 of the Triangle
     * @return the length of side 1
     */
    public double getSide1(){
        return this.side1;
    }

    /**
     * Gets the length of side 2 of the Triangle
     * @return the length of side 2
     */
    public double getSide2(){
        return this.side2;
    }

    /**
     * Gets the length of side 3 of the Triangle
     * @return the length of side 3
     */
    public double getSide3(){
        return this.side3;
    }

    /**
     * Sets the length of side 1 of the Triangle
     * @param length the desired length of side 1
     */
    public void setSide1(double length) {
        this.side1 = length;
    }

    /**
     * Sets the length of side 2 of the Triangle
     * @param length the desired length of side 2
     */
    public void setSide2(double length) {
        this.side2 = length;
    }

    /**
     * Sets the length of side 3 of the Triangle
     * @param length the desired length of side 3
     */
    public void setSide3(double length) {
        this.side3 = length;
    }

    /**
     * Calculates and returns the area of the Triangle, given the dimensions of
     * the sides
     * @return the area of the Triangle
     */
    public double getArea() {
        double semiperimeter = (this.getSide1() + this.getSide2() + this.getSide3()) / 2.0;
        double squarea = semiperimeter * (semiperimeter - this.getSide1()) * (semiperimeter - this.getSide2()) * (semiperimeter - this.getSide3());

        return Math.sqrt(squarea);
    }

    /**
     * Fills out the information of the triangle using input directly from the
     * user.
     */
    public void buildFromUserInput(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the color of the triangle (e.g. \"red\"):");
        this.setColor(input.next());

        System.out.println("Is the triangle filled (y or n):");
        this.setFilled( input.next().equals("y"));

        System.out.println("Enter the non-zero, positive lengths of the three sides of the triangle:");
        this.setSide1(input.nextDouble());
        this.setSide2(input.nextDouble());
        this.setSide3(input.nextDouble());
    }
}
