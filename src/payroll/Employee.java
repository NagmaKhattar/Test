package payroll;

/**
 * A class that represents Employee Objects.
 * Employees have a name, a number of hours
 * and an hourly wage.
 * 
 * Modifications:
 * 1. Removed redundant getter and setter methods - Applied DRY principle
 * 2. Improved the equals method to check all properties - Enhanced reliability
 * 
 * @author Liz Dancy, 2018
 * @modifier Hazem Alnajdawi, 2023
 * fgghjhj
 */
public class Employee {
    private String name;
    private double numHours;
    private double hourlyWage;

    /**
     * Default constructor for safety in inheritance.
     */
    public Employee() {}

    public Employee(String givenName, double givenWage, double givenHours) {
        this.name = givenName;
        this.hourlyWage = givenWage;
        this.numHours = givenHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getHours() {
        return numHours;
    }

    public void setHours(double hoursWorked) {
        this.numHours = hoursWorked;
    }

    public double getWage() {
        return hourlyWage;
    }

    public void setWage(double workingWage) {
        this.hourlyWage = workingWage;
    }

    public double calculatePay() {
        return numHours * hourlyWage;
    }

    @Override
    public String toString() {
        return "This employee's name is: " + name;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Employee)) return false;
        
        Employee otherEmployee = (Employee) other;
        return this.name.equals(otherEmployee.name) &&
               this.numHours == otherEmployee.numHours &&
               this.hourlyWage == otherEmployee.hourlyWage;
    }

    public String printStatement() {
        return "Employee:" + name + " is owed: $"
                + calculatePay() + "\n**************************************************************";
    }
}
