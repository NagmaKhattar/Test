package payroll;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, double hours, double wage) {
        super(name, hours, wage);
    }

    @Override
    public double calculatePay() {
        double extra = (getHours() * getWage()) * 0.1;
        return (getHours() * getWage()) + extra;
    }
}
