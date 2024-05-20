package ra.exercise_session05;

import java.util.Scanner;

public class Fan {

    private int SLOW = 1;
    private int MEDIUM = 2;
    private int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";


    // 1. Xây dựng constructor không khởi tạo bất cứ thông tin gì của đối tượng
    public Fan() {
    }

    // 2. Xây dựng constructor cho phép khởi tạo tất cả thông tin sinh viên
    public Fan(int SLOW, int MEDIUM, int FAST, int speed, boolean on, double radius, String color) {
        this.SLOW = SLOW;
        this.MEDIUM = MEDIUM;
        this.FAST = FAST;
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public void setSLOW(int SLOW) {
        this.SLOW = SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public void setMEDIUM(int MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public void setFAST(int FAST) {
        this.FAST = FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan is on {" +
                    "Speed = " + speed +
                    ", On = " + on +
                    ", Radius = " + radius +
                    ", Color = '" + color + '\'' +
                    '}';
        } else {
            return "Fan is off {" +
                    "Speed = " + speed +
                    ", On = " + on +
                    ", Radius = " + radius +
                    ", Color = '" + color + '\'' +
                    '}';
        }
    }

    public void Fan1() {
        this.speed = FAST;
        this.radius = 10;
        this.color = "Yellow";
        this.on = true;
    }
    public void Fan2() {
        this.speed = MEDIUM;
        this.radius = 5;
        this.color = "Blue";
        this.on = false;
    }
}
