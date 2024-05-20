package ra.exercise_session05;

import java.util.Scanner;

public class Circle {
    /*
     * Xây dựng lớp Circle gồm:
     * - Các đặc điểm:
     *   + Bán kính
     *   + Màu sắc
     * - Các hành vi:
     *   + khởi tạo (constructor) 0 tham số và có tham số
     *   + inputData: nhập bán kính; nhập màu sắc
     *   + Chu vi: perimeter(): perimeter = 2 * radius * PI;
     *   + Diện tích:area(): area = 2 * radius * PI;
     *   + displayData: màu sắc; chu vi; diện tích
     *     *
     * */

    private float radius;
    private String color;
    private float PI = 3.14F;
    private float perimeter = 2 * radius * PI;
    private float area = PI * radius * radius;

    // 1. Xây dựng constructor không khởi tạo bất cứ thông tin gì của đối tượng
    public Circle() {
    }

    // 2. Xây dựng constructor cho phép khởi tạo tất cả thông tin sinh viên
    public Circle(Float radius, String color, float PI, float perimeter, float area) {
        this.radius = radius;
        this.color = color;
        this.PI = PI;
        this.perimeter = perimeter;
        this.area = area;
    }

    public Float getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float PI () {
        return PI;
    }

    public void setPI(float PI) {
        this.PI = PI;
    }

    public Float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Float perimeter) {
        this.perimeter = perimeter;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào bán kính đường tròn: ");
        this.radius = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào màu sắc đường tròn: ");
        this.color = scanner.nextLine();
    }

    public void perimeter(Scanner scanner) {
        this.perimeter = 2 * this.radius * this.PI;
    }

    public void area(Scanner scanner) {
        this.area = 2 * this.radius * this.PI;
    }

    public void displayData() {
        System.out.printf("Màu sắc đường tròn: %s - Chu vi: %f - Diện tích: %f\n", color, perimeter, area);
    }

}
