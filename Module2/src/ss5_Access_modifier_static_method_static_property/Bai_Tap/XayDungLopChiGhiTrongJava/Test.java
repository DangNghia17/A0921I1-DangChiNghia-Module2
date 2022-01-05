package ss5_Access_modifier_static_method_static_property.Bai_Tap.XayDungLopChiGhiTrongJava;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Nghia", "C03");
        student1.setName("Đặng Chí ");
        student1.setClasses("C04 ");
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());
        //sau khi đổi modifier
        //không thể truy cập đến được!
    }
}
