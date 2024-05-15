package payroll;

import java.util.Scanner;

public class Payroll {
    private static final int MAX_EMPLOYEES = 100;
    private Employee employees[] = new Employee[MAX_EMPLOYEES];

    public static void main(String[] args) {
        Payroll app = new Payroll();
        app.run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Payroll Application.");

        for (int i = 0; i < MAX_EMPLOYEES; i++) {
            System.out.println("Please enter the Employee's name: ");
            String name = sc.nextLine();
            System.out.println("Please enter the Employee's number of hours worked: ");
            double numHours = Double.parseDouble(sc.nextLine());
            System.out.println("Please enter the Employee's hourly wage: ");
            double wage = Double.parseDouble(sc.nextLine());
            System.out.println("Do you want to create a manager? Type yes or no");
            String managerChoice = sc.nextLine();
            
            if (managerChoice.equalsIgnoreCase("yes")) {
                System.out.println("Please enter a bonus for the manager: ");
                double bonus = Double.parseDouble(sc.nextLine());
                employees[i] = EmployeeFactory.createEmployee("Manager", name, numHours, wage, bonus);
            } else {
                employees[i] = EmployeeFactory.createEmployee("PartTime", name, numHours, wage, 0);
            }

            System.out.println("Would you like to enter another employee (yes or no)?");
            String yesOrNo = sc.nextLine();
            if (!yesOrNo.equalsIgnoreCase("yes")) {
                break;
            }
        }

        double totalPaid = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.printStatement());
                totalPaid += employee.calculatePay();
            }
        }

        System.out.println("The total amount to be paid to all employees is $" + totalPaid);
        sc.close(); // Close the Scanner to prevent resource leak
    }
}
