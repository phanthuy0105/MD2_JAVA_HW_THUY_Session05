package ra.exercise_session05;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Exercise6_Circle circle = new Exercise6_Circle(3.0);
        System.out.println("Radius is Circle:" + circle.getRadius()+ "\t" + "Area is:" + circle.getArea());
        Exercise6_Circle circle2 = new Exercise6_Circle(2.0, "Green");
        System.out.println("Radius is Circle:" + circle2.getRadius() + "\t" + "Color is Circle:" + circle2.getColor() + "\t" + "Area is:" + circle2.getArea());
    }
}
