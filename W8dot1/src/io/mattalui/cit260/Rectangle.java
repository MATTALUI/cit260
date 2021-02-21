package io.mattalui.cit260;


/**
 * 1) Two data fields named width and height, that specify the width and height
 *    of the rectangle. The default values for both width and height should be 1.
 * 2) A no-arg constructor that creates a default rectangle object.
 * 3) A parameterized constructor that creates a rectangle object with the
 *    specified height and width.
 * 4) Getter and setter methods for height and width.
 * 5) A method named getArea( ) that computes and returns the area of the rectangle.
 * 6) A method names getPerimeter( ) that computes and returns the perimeter of
 *    the rectangle.
 * 7) Your file should have the proper file prologue (comments) and each method
 *    should have the proper method prologue (comments).
 *
 * @author Matthew Hummer
 */
public class Rectangle {
    private float height;
    private float width;

    /**
     * Default constructor; creates a rectangle with default 1x1 dimensions
     */
    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }

    /**
     * Creates an instance of a Rectangle using provided  dimensions
     *
     * @param height the desired height of the rectangle
     * @param width the desired height of the width
     */
    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    /**
     * Gets the height of the rectangle
     *
     * @return the height of the rectangle
     */
    public float getHeight() {
        return this.height;
    }

    /**
     * Gets the width of the rectangle
     *
     * @return the width of the rectangle
     */
    public float getWidth() {
        return this.width;
    }

    /**
     * Sets the height of the rectangle
     *
     * @param height desired height of the rectangle
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Sets the width of the rectangle
     *
     * @param width desired width of the rectangle
     */
    public void setWidth(float width) {
        this.width = width;
    }

    /**
     * Calculates the area of the rectangle
     *
     * @return the area of the rectangle
     */
    public float getArea() {
        return this.width * this.height;
    }

    /**
     * Calculates the area of the rectangle
     *
     * @return the area of the rectangle
     */
    public float getPerimeter(){
        return this.width + this.width + this.height + this.height;
    }

    /**
     * Displays the information for the rectangle in a user-friendly way
     */
    public void printData() {
        System.out.format("height = %.2f\n", this.height);
        System.out.format("width = %.2f\n", this.width);
        System.out.format("area = %.2f\n", this.getArea());
        System.out.format("perimeter = %.2f\n", this.getPerimeter());
    }
}
