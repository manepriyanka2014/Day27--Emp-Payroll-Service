package bridgelabz.day27emppayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService() {
        employeePayrollList = new ArrayList<>();
    }

    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.printWelcomeMessage();
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }

    /* This method is implementing Welcome Message */
    public void printWelcomeMessage() {
        System.out.println("Welcome To The Employee Payroll Service System");
    }

    /**
     * Purpose : To read the information of Employees from the console
     * @param consoleInputReader takes the information of employees
     */
    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID : ");
        int id = consoleInputReader.nextInt();
        consoleInputReader.nextLine();
        System.out.println("Enter Employee Name : ");
        String name = consoleInputReader.nextLine();
        System.out.println("Enter Employee Salary : ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    /* This method is implementing to write the Employee Payroll to the console */
    private void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll Roaster to console\n" + employeePayrollList);
    }
}