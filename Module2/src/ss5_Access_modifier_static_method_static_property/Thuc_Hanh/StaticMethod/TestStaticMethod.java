package ss5_Access_modifier_static_method_static_property.Thuc_Hanh.StaticMethod;

public class TestStaticMethod {
    public static void main(String args[]) {
        Student.change(); //calling change method

        //tạo các đối tượng
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        //gọi method hiện ra màn hình
        s1.display();
        s2.display();
        s3.display();
    }
}
