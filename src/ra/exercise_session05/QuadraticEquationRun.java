package ra.exercise_session05;

import java.util.Scanner;

public class QuadraticEquationRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.inputData(scanner);
        quadraticEquation.getDiscriminant(scanner);
        quadraticEquation.getRoot1(scanner);
        quadraticEquation.getRoot2(scanner);
        quadraticEquation.displayData();
    }
}
