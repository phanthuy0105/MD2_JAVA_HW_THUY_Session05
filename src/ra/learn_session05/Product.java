/*
    Example_OOP_UD
     * I.Xây dựng lớp Product trong package ra gồm:
     * 1. Các thuộc tính
     *   - Mã sản phẩm
     *   - Tên sản phẩm
     *   - Giá sản phẩm
     *   - Mô tả sản phẩm
     *   - Trạng thái sản phẩm: còn hàng - hết hàng
     * 2. Gồm 2 constructor: default và khởi tạo tất cả thông tin sản phẩm
     * 3. Các phương thức getter/setter
     * 4. Các phương thức: inputData cho phép nhập thông tin sản phẩm,
     * displayData cho phép hiển thị thông tin sản phẩm
 */

package ra.learn_session05;

import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private float price;
    private String description;
    private boolean status;

    // Constructor default: không tham số
    public Product() {
    }

    public Product(String productId, String productName, float price, String description, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sản phẩm:");
        this.productId = scanner.nextLine();
        System.out.println("Nhập vào tên sản phẩm");
        this.productName = scanner.nextLine();
        System.out.println("Nhập vào giá sản phẩm:");
        this.price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào mô tả sản phẩm:");
        this.description = scanner.nextLine();
        System.out.println("Nhập vào tình trạng sản phẩm:");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }

    public void displayDataProduct() {
        System.out.printf("Mã sản phẩm: %s - Tên sản phẩm: %s - Giá: %f\n", this.productId, this.productName, this.price);
        System.out.printf("Mô tả: %s - Tình trạng: %s\n", this.description, this.status ? "Còn hàng" : "Hết hàng");
    }
}
