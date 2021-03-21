package io.mattalui.cit260;

/**
 * @author Matthew Hummer
 */
public class Circle extends Shape {
    private double radius;

    /**
     * Creates a Circle with the provided id and radius
     * @param id the desired id of the Circle
     * @param radius the desired radius of the Circle
     */
    public Circle(int id, double radius) {
        super(id);
        this.setRadius(radius);
    }

    /**
     * Gets the radius of a Circle
     * @return the radius of a Circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of a Circle
     * @param radius the desired radius of a Circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of a Circle
     * @return the area of the Circle
     */
    public double getArea(){
        return Math.PI * (this.getRadius() * this.getRadius());
    }
}
