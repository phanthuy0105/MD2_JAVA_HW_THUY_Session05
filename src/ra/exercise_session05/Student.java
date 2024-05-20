package ra.exercise_session05;

import java.util.Scanner;

public class Student {
    /*
     * Xây dựng lớp sinh viên gồm:
     * - Các đặc điểm:
     *   + Mã sinh viên
     *   + Tên sinh viên
     *   + Tuổi
     *   + Giới tính
     *   + Địa chỉ
     *   + Số điện thoại
     * - Các hành vi:
     *   + khởi tạo (constructor) 0 tham số và có tham số
     *   + inputData()
     *   + displayData()
     *     *
     * */
    //1: Fields/Properties/Attributes: thuộc tính mô tả đặc điểm của đối tượng sinh viên
    //Syntax: Access Modifier + Datatype + fieldName
    //Lưu ý: Để đảm bảo tính đóng gói (bao đóng) thì các thuộc tính phải được khai báo với bổ từ private
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String address;
    private String phone;

    //2: Constructors: hàm tạo giúp khởi tạo đối tượng từ lớp
    //Syntax: Access Modifier + ClassName(parameters)
    //Parameters: datatype + paramName
    //Lưu ý: Để đảm bảo ở đâu cũng có thể khởi tạo được đối tượng, bổ từ truy cập của constructors là public
    //--Constructor default: không tham số
    //2.1. Xây dựng constructor không khởi tạo bất cứ thông tin gì của đối tượng
    public Student() {
    }

    //2.2. Xây dựng constructor cho phép khởi tạo tất cả thông tin sinh viên
    public Student(String studentId, String studentName, int age, boolean sex, String address, String phone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
    }
    //3. Methods: phương thức mô tả các hành vi của đối tượng
    //Syntax: Access Modifier + ReturnData + MethodName(parameters)
    //3.1. Getter/Setter
    //- Getter: lấy dữ liệu ra
    //- Setter: gán giá trị cho các thuộc tính

    public String getStudentId() {
        //Kiểm tra quyền
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Xây dựng phương thức cho phép nhập thông tin của sinh viên
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên:");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính sinh viên:");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ sinh viên:");
        this.address = scanner.nextLine();
        System.out.println("Nhập vào số điện thoại sinh viên:");
        this.phone = scanner.nextLine();
    }

    //Xây dựng phương thức cho phép hiển thị thông tin sinh viên
    public void displayData() {
        System.out.printf("Mã sinh viên: %s - Tên sinh viên: %s - Tuổi: %d\n", this.studentId, this.studentName, this.age);
        System.out.printf("Giới tính: %s - Địa chỉ: %s - Số điện thoại: %s\n", this.sex ? "Nam" : "Nữ", this.address, this.phone);
    }

}