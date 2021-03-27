package io.mattalui.cit260;

/**
 * @author Matthew Hummer
 */
public class Triangle extends Shape {
    private double leg1;
    private double leg2;

    /**
     * Creates a Triangle with the provided id and dimensions
     * @param id the desired id of the Triangle
     * @param leg1 the desired length of the first leg
     * @param leg2 the desired length of the second leg
     */
    public Triangle (int id, Point point, double leg1, double leg2){
        super(id, point);
        this.setLeg1(leg1);
        this.setLeg2(leg2);
    }

    /**
     * Gets the length of the first leg
     * @return the length of the first leg
     */
    public double getLeg1() {
        return leg1;
    }

    /**
     * Gets the length of the second leg
     * @return the length of the second leg
     */
    public double getLeg2() {
        return this.leg2;
    }

    /**
     * Sets the length of the first leg
     * @param leg1 the desired length of the first leg
     */
    public void setLeg1(double leg1) {
        this.leg1 = leg1;
    }

    /**
     * Sets the length of the second leg
     * @param leg2 the desired length of the second leg
     */
    public void setLeg2(double leg2) {
        this.leg2 = leg2;
    }

    /**
     * Calculates the area of the Triangle
     * @return the area of the Triangle.
     */
    public double getArea() {
        double half = 2;
        return (this.getLeg1() * this.getLeg2()) / half;
    }

    /**
     * Formats the basic information of a Shape to a string that can be more
     * easily parsed.
     * @return a parsable string
     */
    @Override
    public String toParsableRow() {
        return String.format(
                "%s %.2f %.2f",
                super.toParsableRow(),
                this.getLeg1(),
                this.getLeg2()
        );
    }
}
