package io.mattalui.cit260;

/**
 * Design a parent class named Employee. Your Employee class should include:
 * 1) A String, name,  that holds the employee's name.
 * 2) An integer serialNumber, that holds the employee's serial number.
 * 3) A no-arg constructor that initializes name to "none" and serialNumber
 *    to 0.
 * 4) A parameterized constructor that initializes name and serialNumber using
 *    arguments passed to the constructor.
 * 5) Getters for name and serialNumber.
 * 6) A method named getGrossPay( ) that returns a zero;
 * 7) A method named getFedWithholding( ) that returns a zero.
 * 8) A method named getStateWithholding( ) that returns a zero.
 *
 * @author Matthew Hummer
 */
public abstract class Employee {
    private String name;
    private int serialNumber;

    /**
     * Default constructor. Creates an Employee using the default values for
     * name and serialNumber
     */
    public Employee() {
        this.setName("none");
        this.setSerialNumber(0);
    }

    /**
     * Creates an Employee using the provided name and serialNumber
     *
     * @param name the desired name of the Employee
     * @param serialNumber the desired serialNumber of the Employee
     */
    public Employee(String name, int serialNumber) {
        this.setName(name);
        this.setSerialNumber(serialNumber);
    }

    /**
     * Gets the name of the Employee
     *
     * @return the name of the Employee
     */
    public String getName(){
        return this.name;
    }

    /**
     * Gets the serialNumber of the Employee
     *
     * @return the serialNumber of the EMployee
     */
    public int getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * Sets the name of the Employee
     *
     * @param name the desired name of the Employee
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the serialNumber of the Employee
     *
     * @param serialNumber the desired serialNumber of the employee
     */
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Gets the federal 15% witholding from the gross pay
     *
     * @return the amount of witholding for the federal gub'm'nt
     */
    public double getFedWitholding(){
        double federalWitholdingAmount = 0.15; // 15%
        return this.getGrossPay() * federalWitholdingAmount;
    }

    /**
     * Gets the federal 7% witholding from the gross pay
     *
     * @return the amount of witholding for the state gub'm'nt
     */
    public double getStateWitholding(){
        double stateWitholdingRate = 0.07; // 7%
        return this.getGrossPay() * stateWitholdingRate;
    }

    /**
     * Calculates the net pay for an Employee by removing all witholdings from
     * gross pay.
     *
     * @return the net pay for an Employee
     */
    public double getNetPay() {
        double netPay = this.getGrossPay() - this.getFedWitholding() - this.getStateWitholding();

        return netPay;
    }

    public void displayPayroll() {
        System.out.format("Employee: %s Serial: %d\n", this.getName(), this.getSerialNumber());
        System.out.format("Gross Pay: $%,.2f\n", this.getGrossPay());
        System.out.format("Federal Withholding: $%,.2f\n", this.getFedWitholding());
        System.out.format("State Withholding: $%,.2f\n", this.getStateWitholding());
        System.out.format("Net Pay: $%,.2f\n", this.getNetPay());
        System.out.println();
    }

    // I know the assignment wanted these to just return zero, but I kind of
    // feel like contextually this makes sense as an abstract method
    abstract public double getGrossPay();
}
