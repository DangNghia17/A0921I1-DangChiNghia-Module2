package ss6_ke_thua.bai_tap.CircleAndCylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.0 ,"yellow");
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        Cylinder cylinder1 = new Cylinder(3.0 , "red" , 2.55);
        System.out.println(cylinder1);
        System.out.println(cylinder1.getPerimeter());
        System.out.println(cylinder1.getArea());
        System.out.println(cylinder1.getVolume());
    }
}
