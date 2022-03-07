package ss6_ke_thua_trong_java.bai_tap.DesignAndImplementTriangle;

public class Running {
    public static void main(String[] args) {
        Shape s1 = new Shape("Red");
        System.out.println("Shape is : " + s1 );

        Triangle t2 = new Triangle(1.0 , 2, 2);
        System.out.println("S2 = " + t2);
    }
}
