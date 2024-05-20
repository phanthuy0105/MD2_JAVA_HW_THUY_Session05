package ra.exercise_session05;

import java.util.Scanner;

public class FanRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan obj = new Fan();
        obj.Fan1 ();
        String result = obj.toString();
        System.out.println(result);
        obj.Fan2 ();
        String result2 = obj.toString();
        System.out.println(result2);
    }
}
