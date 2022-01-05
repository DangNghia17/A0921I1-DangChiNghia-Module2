package ss5_Access_modifier_static_method_static_property.Thuc_Hanh.StaticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //constructor để tạo các biến
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method để thay đổi giá trị đã khai báo phía trên
    static void change() {
        college = "CODEGYM";
    }

    //tạo method để hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
