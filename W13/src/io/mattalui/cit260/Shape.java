package io.mattalui.cit260;

/**
 * @author Matthew Hummer
 */
public abstract class Shape {
    private int id;
    private Point point;

    /**
     * Creates a Shape using the provided id
     *
     * @param id the desired id of the Shape
     */
    public Shape(int id, Point point) {
        this.setId(id);
        this.setPoint(point);
    }

    /**
     * Gets the id of the Shape
     * @return the id of the Shape
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id of the Shape
     * @param id the desired id of the Shape
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the Point location of a shape
     * @return the Point location of a shape
     */
    public Point getPoint() {
        return this.point;
    }

    /**
     * Sets the Point location of a shape
     * @param point the desired Point location of the shape
     */
    public void setPoint(Point point) {
        this.point = point;
    }

    /**
     * Formats the data about the shape and displays it in a user-friendly way
     */
    public void display() {
        System.out.format("%-10s%-5d%s%11.2f\n", this.getClass().getSimpleName(), this.getId(), this.getPoint().toString(), this.getArea());
    }

    /**
     * Formats the basic information of a Shape to a string that can be more
     * easily parsed.
     * @return a parsable string
     */
    public String toParsableRow() {
        return String.format(
                "%s %d %d %d",
                this.getClass().getName(),
                this.getId(),
                this.getPoint().getX(),
                this.getPoint().getY()
        );
    }

    /**
     * Calculates the area of a Shape
     * @return the area of the Shape
     */
    public abstract double getArea();
}
