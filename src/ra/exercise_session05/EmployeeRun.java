package ra.exercise_session05;

import java.util.Scanner;

public class EmployeeRun {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Employee employee = new Employee();
        employee.inputData(scanner);
        employee.calSalary(scanner);
        employee.displayData();
    }
}
