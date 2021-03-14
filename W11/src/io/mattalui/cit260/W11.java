package io.mattalui.cit260;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Matthew Hummer
 */
public class W11 {
    /**
     * Your main( ) method should do the following:
     * 1) Tells the user what the program does.
     * 2) Creates an ArrayList<Employee>.
     * 3) Create instances for the following employees and add them to the
     *    ArrayList:
     *       - Hourly employee Harry Hacker, serial number 123. Harry earns
     *         $15.00 and hour and works 30 hours a week.
     *       - Hourly employee Isabel Intern, serial number 233. Isabel earns
     *         $12.50 and hour and works 20 hours a week.
     *       - Salaried employee Cathy Coder, serial number 611. Cathy earns
     *         $80,000 a year.
     * 7) Using an appropriate loop to go through the Employees in the ArrayList,
     *    print out a payroll report as shown in the following diagram:
     * 8) Display a goodbye message.
     * @param args
     */
    public static void main(String[] args) {
        displayIntro();

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new HourlyEmployee("Harry Hacker", 123, 15.0, 30));
        employees.add(new HourlyEmployee("Isabel Intern", 233, 12.50, 20));
        employees.add(new SalariedEmployee("Cathy Coder", 611, 80000));

        System.out.println("Payroll Report");
        for (Employee employee : employees) {
            employee.displayPayroll();
        }

        sayGoodbye();
    }

    /**
     * Displays an explanation of the program in a user friendly way.
     */
    public static void displayIntro() {
        System.out.println("This program shows some employees and their payroll information.\n");
    }

    /**
     * In this world, nothing can be certain, except death and taxes.
     */
    public static void sayGoodbye() {
        System.out.println("\nGoodbye...");
    }
}
