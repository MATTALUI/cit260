package io.mattalui.cit260;

/**
 * @author Matthew Hummer
 */
public abstract class Shape {
    private int id;

    /**
     * Creates a Shape using the provided id
     *
     * @param id the desired id of the Shape
     */
    public Shape(int id) {
        this.setId(id);
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
     * Formats the data about the shape and displays it in a user-friendly way
     */
    public void display() {
        System.out.format("%d\t\t\t\t%.2f sq inches\n", this.getId(), this.getArea());
    }

    /**
     * Calculates the area of a Shape
     * @return the area of the Shape
     */
    public abstract double getArea();
}
