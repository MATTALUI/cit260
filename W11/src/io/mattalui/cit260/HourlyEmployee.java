package io.mattalui.cit260;

/**
 * Design a class named Hourly that inherits from Employee. Your Hourly class
 * should include:
 * 1) A double, hourlyWage,  that holds this person's hourly wage.
 * 2) A double, hoursWorked, that holds the number of hours this person worked.
 * 3) An appropriate no-arg constructor.
 * 4) An appropriate parameterized constructor.
 * 5) Getters for hourlyWage and hoursWorked.
 * 6) Overload the getGrossPay(), getFedWithholding() and getStateWithholding()
 *    methods from the Employee class. The gross pay for an Hourly employee is
 *    calculated as hoursWorked x hourlyWage. Use a state tax rate of 0.07 and
 *    a federal tax rate of 0.15.
 *
 * @author Matthew Hummer
 */
public class HourlyEmployee extends Employee {
    private double hourlyWage;
    private double hoursWorked;

    /**
     * Default constructor. Creates an HourlyEmployee with default values
     */
    public HourlyEmployee() {
        super();
        this.setHoursWorked(0.0);
        this.setHourlyWage(0.0);
    }

    /**
     * Creates an HourlyEmployee using the provided information
     *
     * @param name the name of the HourlyEmployee
     * @param serialNumber the serialNumber of the Employee
     * @param hourlyWage the amount that the HourlyEmployee makes per hour
     * @param hoursWorked the amount of hours the HourlyEmployee has worked
     */
    public HourlyEmployee(String name, int serialNumber, double hourlyWage, double hoursWorked) {
        super(name, serialNumber);
        this.setHoursWorked(hoursWorked);
        this.setHourlyWage(hourlyWage);
    }

    /**
     * Gets the hourly wage of the HourlyEmployee
     *
     * @return the hourly wage of the HourlyEmployee
     */
    public double getHourlyWage(){
        return this.hourlyWage;
    }

    /**
     * Gets the number of hours the HourlyEmployee has worked
     *
     * @return the number of hours the HourlyEMployee has worked
     */
    public double getHoursWorked(){
        return this.hoursWorked;
    }

    /**
     * Sets the hourly wage of the HourlyEmployee
     *
     * @param hourlyWage the desired hourly wage of the HourlyEmployee
     */
    public void setHourlyWage(double hourlyWage){
        this.hourlyWage = hourlyWage;
    }

    /**
     * Sets the number of hours the HourlyEmployee has worked
     *
     * @param hoursWorked the number of hours the HourlyEmployee has worked
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    /**
     * Calculates the gross pay of the HourlyEmployee based on the hourly rate
     * and the number of hours worked
     *
     * @return the gross pay of the HourlyEmployee
     */
    public double getGrossPay(){
        return this.getHourlyWage() * this.getHoursWorked();
    }
}
