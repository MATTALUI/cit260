package io.mattalui.cit260;

/**
 * @author Matthew Hummer
 */
public class Point { // I named it "Point" instead of "MyPoint" cause I think that name is stupid
    private int x;
    private int y;

    /**
     * No-arg constructor. Creates Point that defaults to (0,0)
     */
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructs a point using provided x and y values
     *
     * @param x desired x-value of a Point
     * @param y desired y-value of a Point
     */
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x-value for the Point
     *
     * @return the x-value for the Point
     */
    public int getX(){
        return this.x;
    }

    /**
     * Gets the y-value for the Point
     *
     * @return the y-value  for the Point
     */
    public int getY(){
        return this.y;
    }

    /**
     * Sets the x-value for the Point
     *
     * @param x the x-value for the Point
     */
    public void setX(int x){
        this.x = x;
    }

    /**
     * Sets the y-value for the Point
     *
     * @param y the y-value for the Point
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Builds a string representation of a Point in standard format
     *
     * @return the x-y-coordinate representation of a String
     */
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
}
