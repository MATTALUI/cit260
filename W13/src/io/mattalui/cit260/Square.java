package io.mattalui.cit260;

/**
 * @author Matthew Hummer
 */
public class Square extends Shape {
    private double size;

    /**
     * Creates a Square with the provided id and size
     * @param id the desired id of the square
     * @param size the desired size of the square
     */
    public Square(int id, Point point, double size) {
        super(id, point);
        this.setSize(size);
    }

    /**
     * Gets the size of the Square
     * @return the size of the square
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the size of the Square
     * @param size the desired size of the square
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Calculates the are of the suqare
     * @return the are of the square
     */
    public double getArea(){
        return this.getSize() * this.getSize();
    }

    /**
     * Formats the basic information of a Shape to a string that can be more
     * easily parsed.
     * @return a parsable string
     */
    @Override
    public String toParsableRow() {
        return String.format(
                "%s %.2f",
                super.toParsableRow(),
                this.getSize()
        );
    }
}
