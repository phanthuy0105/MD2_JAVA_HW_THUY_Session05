package ra.exercise_session05;

public class Exercise6_Circle {
    private double radius;
    private String color;

    public Exercise6_Circle(double radius, String color) {
        this.radius = 1.0;
        this.color = "Red";
    }

    public Exercise6_Circle(double r) {
        this.radius = r;
        this.color = "Red";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius;
    }
}
