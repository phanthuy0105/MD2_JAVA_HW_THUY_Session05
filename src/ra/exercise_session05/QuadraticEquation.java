package ra.exercise_session05;

import java.util.Scanner;

public class QuadraticEquation {
    /*
     * Xây dựng lớp Circle gồm:
     * - Các đặc điểm:
     *   + PT bậc 2: ax^2 + bx +c = 0
     *   + biến hệ số a, b, c
     *   + biến x1, x2, delta
     * - Các hành vi:
     *   + delta = b^2 - 4ac
     *   + delta >= 0 => PT có 2 nghiệm x1 = (-b + sqrt(delta))/(2a); x2 = (-b - sqrt(delta))/(2a)
     *   + delta = 0 => PT có 1 nghiệm x1 = x2 = -b/2a
     *   + delta < 0 => PT có vô nghiệm
     *     *
     * */

    private double coefficientA;
    private double coefficientB;
    private double coefficientC;
    private double delta;
    private double x1;
    private double x2;


    // 1. Xây dựng constructor không khởi tạo bất cứ thông tin gì của đối tượng
    public QuadraticEquation() {
    }

    // 2. Xây dựng constructor cho phép khởi tạo tất cả thông tin sinh viên
    public QuadraticEquation(double coefficientA, double coefficientB, double coefficientC, double delta, double x1, double x2) {
        this.coefficientA = coefficientA;
        this.coefficientB = coefficientB;
        this.coefficientC = coefficientC;
        this.delta = delta;
        this.x1 = x1;
        this.x2 = x2;
    }

    public Double getCoefficientA() {
        return coefficientA;
    }

    public void setCoefficientA(double coefficientA) {
        this.coefficientA = coefficientA;
    }

    public Double getCoefficientB() {
        return coefficientB;
    }

    public void setCoefficientB(double coefficientB) {
        this.coefficientB = coefficientB;
    }

    public Double getCoefficientC() {
        return coefficientC;
    }

    public void setCoefficientC(double coefficientC) {
        this.coefficientC = coefficientC;
    }

    public Double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public Double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public Double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào hệ số a: ");
        this.coefficientA = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào hệ số b: ");
        this.coefficientB = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào hệ số c: ");
        this.coefficientC = Double.parseDouble(scanner.nextLine());
    }

    public void getDiscriminant(Scanner scanner) {
        this.delta = Math.pow(coefficientB, 2) - 4 * this.coefficientA * this.coefficientC;
    }


    public void getRoot1(Scanner scanner) {
        this.x1 = (-this.coefficientB + Math.sqrt(delta)) / (2 * this.coefficientA);
    }

    public void getRoot2(Scanner scanner) {
        this.x2 = (-this.coefficientB - Math.sqrt(delta)) / (2 * this.coefficientA);
    }

    public void displayData() {
        if (this.coefficientA == 0) {
            System.err.println("Nhập dữ liệu sai");
        } else {
            if (delta > 0) {
                System.out.printf("The equation has two roots: X1 = %f and X2 = %f\n", this.x1, this.x2);
            } else if (delta == 0) {
                System.out.printf("The equation has one roots equal: X1 = X2 = %f\n", this.x1 = this.x2 = (-this.coefficientB) / (2 * coefficientA));
            } else {
                System.out.printf("The equation has no roots");
            }
        }
    }
}
