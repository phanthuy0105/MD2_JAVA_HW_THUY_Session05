package ra.exercise_session05;

import ra.learn_session05.Student;

import java.util.Scanner;

public class CircleRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        circle.inputData(scanner);
        circle.perimeter(scanner);
        circle.area(scanner);
        circle.displayData();
    }
}
