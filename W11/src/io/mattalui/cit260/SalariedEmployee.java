package io.mattalui.cit260;

/**
 * Design a class named Salaried that inherits from Employee. Your Salaried
 * class should include:
 * 1) A double, annualSalary, that holds the annual salary for this person.
 * 2) An appropriate no-arg constructor.
 * 3) An appropriate parameterized constructor.
 * 4) A Getter for salary.
 * 5) Overload the getGrossPay(), getFedWithholding() and getStateWithholding()
 *    methods from the Employee class. The gross pay for an Hourly employee is
 *    calculated as annualWage / 52. Use a state tax rate of 0.07 and a federal tax
 *    rate of 0.15.
 *
 * @author Matthew Hummer
 */
public class SalariedEmployee extends Employee {
    private double annualSalary;

    /**
     * Default constructor. Creates a SalariedEmployee  with default values
     */
    public SalariedEmployee() {
        super();
        this.setAnnualSalary(0.0);
    }

    /**
     * Creates a SalariedEmployee using the information provided.
     *
     * @param name the name of the SalariedEmployee
     * @param serialNumber the serialNumber of the SalariedEmployee
     * @param annualSalary the annual salary of the SalariedEmployee
     */
    public SalariedEmployee(String name, int serialNumber, double annualSalary) {
        super(name, serialNumber);
        this.setAnnualSalary(annualSalary);
    }

    /**
     * Gets the annual salary of the SalariedEmployee
     *
     * @return the annual salry of the SalariedEmployee
     */
    public double getAnnualSalary() {
        return this.annualSalary;
    }

    /**
     * Sets the annual salary of the SalariedEmployee
     *
     * @param annualSalary the desired annual salary of the SalariedEmployee
     */
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    /**
     * Calculates the gross pay of the SalariedEmployee based off of the annual salary
     *
     * @return
     */
    public double getGrossPay() {
        double weeksInAYear = 52;

        return this.getAnnualSalary() / weeksInAYear;
    }
}
