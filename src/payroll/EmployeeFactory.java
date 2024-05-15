package payroll;

public class EmployeeFactory {
    public static Employee createEmployee(String type, String name, double hours, double wage, double bonus) {
        switch (type) {
            case "Manager":
                return new Manager(name, hours, wage, bonus);
            case "PartTime":
                return new PartTimeEmployee(name, hours, wage);
            default:
                return new Employee(name, hours, wage);
        }
    }
}
