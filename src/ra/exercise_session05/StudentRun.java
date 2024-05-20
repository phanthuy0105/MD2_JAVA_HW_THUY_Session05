package ra.exercise_session05;

import ra.learn_session05.Product;
import ra.learn_session05.Student;

import java.util.Scanner;

public class StudentRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Nhập độ dài mảng: ");
        int lengthArray = Integer.parseInt(scanner.nextLine());
        int[] arrStudent = new int[lengthArray];
        for (int i = 0; i < arrStudent.length; i++) {
            student.inputData(scanner);
        }
        do {
            System.out.println("****************MENU********************");
            System.out.println("1. Hiển thị danh sách tất cả học sinh: ");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("3. Xóa học sinh dựa vào mã học sinh");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách tất cả học sinh: ");
                    for (int i = 0; i < arrStudent.length; i++) {
                        student.displayData();
                    }
                    break;
                case 2:
                    System.out.println("Thêm mới học sinh:");
                    break;
                case 3:
                    System.out.println("Sửa thông tin học sinh dựa vào mã học sinh:");

                    break;
                case 4:
                    System.out.println("Xóa học sinh dựa vào mã học sinh:");

                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-5");
            }
        } while (true);
    }
}
