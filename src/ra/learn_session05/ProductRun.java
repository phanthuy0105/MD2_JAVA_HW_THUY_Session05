/*
 * II. Xây dựng lớp ProductRun trong package ra cho phép khởi tạo đối tượng sản phẩm
 * và thực hiện các chức năng theo menu sau:    *
 * **************MENU*************
 * 1. Nhập thông tin sản phẩm
 * 2. Hiển thị thông tin sản phẩm
 * 3. In ra trạng thái sản phẩm
 * 4. Thoát    *
 */

package ra.learn_session05;

import java.util.Scanner;

public class ProductRun {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       do {
           System.out.println("****************MENU********************");
           System.out.println("1. Nhập thông tin sản phẩm");
           System.out.println("2. Hiển thị thông tin sản phẩm");
           System.out.println("3. In ra trạng thái sản phẩm");
           System.out.println("4. Thoát");
           System.out.print("Lựa chọn của bạn: ");
           int choice = Integer.parseInt(scanner.nextLine());
           Product product = new Product();
           switch (choice) {
               case 1:
                   System.out.println("Nhập thông tin sản phẩm:");
                   product.inputData(scanner);
                   break;
               case 2:
                   System.out.println("Thông tin sản phẩm:");
                   product.displayDataProduct();
                   break;
               case 3:
                   System.out.println("Trạng thái sản phẩm:");

                   break;
               case 4:
                   System.exit(0);
               default:
                   System.err.println("Vui lòng nhập từ 1-4");
           }
       } while (true);
   }
}
