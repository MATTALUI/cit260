package io.mattalui.cit260;

/**
 * Design a class named MyPoint that represents a point in 2-dimensional space.
 * Your class should contain the following:
 *
 * 1) Two data fields x and y, that represent the x-coordinate and the y-coordinate
 *    of the point.
 * 2) Getter and setter methods for x and y.
 * 3) A no-arg constructor that creates a default point at (0,0).
 * 4) A parameterized constructor that creates a point at the designated x and
 *    y coordinate.
 * 5) A member method named distance that calculates and returns the distance
 *    between this MyPoint object and another point that is specified by its
 *    x- and y-coordinates. The method header looks like this:
 *    public double distance(int xCoord, int yCoord);
 * 6) A member method named distance that calculates and returns the distance
 *    between this MyPoint object and another object of the MyPoint class. The
 *    method header looks like this:
 *    public double distance(MyPoint p)
 * 7) A static method named distance that takes two objects of the MyPoint class
 *    as parameters, and calculates and returns the distance between the two of
 *    them. The method header looks like this:
 *    public static double distance (MyPoint mp1, MyPoint mp2)
 * 8) Create a UML diagram that documents your class design Submit your class
 *    diagram with your assignment. The preferred format is a .PDF file.
 *
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

    /**
     * Calculates the distance between a Point and given x and y values
     *
     * @param xCoord the x coordinate of another point
     * @param yCoord the y coordinate of another point
     * @return the distance between a point and the coordinates provided
     */
    public double distance(int xCoord, int yCoord) {
        double deltaX = Math.abs(this.x - xCoord);
        double deltaY = Math.abs(this.y - yCoord);
        double aSquared = Math.pow(deltaX, 2);
        double bSquared = Math.pow(deltaY, 2);

        return Math.sqrt(aSquared + bSquared);
    }

    /**
     * Calculates the distance between a Point and another provided Point
     *
     * @param point the other Point to calculate distance from
     * @return the distance between the Point and the provided Point
     */
    public double distance(Point point) {
        return this.distance(point.getX(), point.getY());
    }

    /**
     * Calculates the distance between two points
     *
     * @param point1 The first Point
     * @param point2 The second Point
     * @return the distance between the two points
     */
    public static double distance (Point point1, Point point2){
        return point1.distance(point2);
    }
}
