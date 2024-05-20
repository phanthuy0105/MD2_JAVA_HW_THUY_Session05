package ra.exercise_session05;

import java.util.Scanner;

public class Employee {
    /*
     * Xây dựng lớp Circle gồm:
     * - Các đặc điểm:
     *   + mã nhân viên(employeeId)
     *   + tên nhân viên (employeeName)
     *   + tuổi (age)
     *   + giới tính (gen)
     *   + hệ số lương(rate)
     *   + lương(salary)
     * - Các hành vi:
     *   + khởi tạo (constructor) 0 tham số và có tham số
     *   + inputData()
     *   + displayData()
     *   + calSalary(): salary = rate * 1.300.000
     *     *
     * */

    private String employeeId;
    private String employeeName;
    private int age;
    private boolean gen;
    private float rate;
    private float salary;

    // 1. Xây dựng constructor không khởi tạo bất cứ thông tin gì của đối tượng
    public Employee() {
    }

    // 2. Xây dựng constructor cho phép khởi tạo tất cả thông tin sinh viên
    public Employee(String employeeId, String employeeName, int age, boolean gen, float rate, float salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGen() {
        return gen;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã nhân viên: ");
        this.employeeId = scanner.nextLine();
        System.out.println("Nhập vào tên nhân viên: ");
        this.employeeName = scanner.nextLine();
        System.out.println("Nhập vào tuổi nhân viên:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính nhân viên:");
        this.gen = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào hệ số lương nhân viên:");
        this.rate = Float.parseFloat(scanner.nextLine());
    }

    public void calSalary(Scanner scanner) {
        this.salary = this.age * 1300000;
    }

    public void displayData() {
        System.out.printf("Mã sinh viên: %s - Tên sinh viên: %s - Tuổi: %d\n", this.employeeId, this.employeeName, this.age);
        System.out.printf("Giới tính: %s - Hệ số lương: %.2f - Lương: %.2f\n", this.gen ? "Nam" : "Nữ", this.rate, this.salary);
    }

}
