package io.mattalui.cit260;

import java.util.Date;

/**
 * @author Matthew Hummer
 */
public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    /**
     * Default constructor creates GeometricObject with default values
     */
    public GeometricObject() {
        this.setColor("white");
        this.setFilled(false);
        this.dateCreated = new Date();
    }

    /**
     * Creates GeometricObject using the values provided
     *
     * @param color the color of the object
     * @param filled whether or not the object should be filled with the color
     */
    public GeometricObject(String color, boolean filled) {
        this.setColor(color);
        this.setFilled(filled);
        this.dateCreated = new Date();
    }

    /**
     * Creates a string representation of the GeometricObject
     *
     * @return a string representation of the GeometricObject
     */
    public String toString() {
        return "created on: " + this.getDateCreated() +
                "\ncolor: " + this.getColor() +
                " and filled: " + this.isFilled();
    }

    /**
     * gets the color of the GeometricObject
     *
     * @return the color of the GeometricObject
     */
    public String getColor() {
        return this.color;
    }

    /**
     * sets the color of the GeometricObject
     * @param color the desired color of the GeometricObject
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     * Gets whether or not the GeometricObject is set to be filled
     *
     * @return the filled value of the GeometricObject
     */
    public boolean isFilled() {
        return this.filled;
    }

    /**
     * Sets the filled value of the GeometricObject
     *
     * @param filled the desired fill value for the GeometricObject
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Gets the date the GeometricObject was created
     *
     * @return the date the GeometricObject was created
     */
    public Date getDateCreated() {
        return this.dateCreated;
    }
}
