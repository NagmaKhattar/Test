package payroll;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double hours, double wage, double bonus) {
        super(name, hours, wage);
        this.bonus = bonus;
    }

    public void setBonus(double bonusAmount) {
        bonus = bonusAmount;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + bonus;
    }

    @Override
    public String printStatement() {
        String a = " Manager: " + getName() + " is owed: ";
        String b = " $" + calculatePay();
        String c = "**************************************************************";
        return a + b + c;
    }
}
