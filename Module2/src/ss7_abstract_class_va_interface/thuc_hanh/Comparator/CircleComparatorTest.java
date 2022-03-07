package ss7_abstract_class_va_interface.thuc_hanh.Comparator;
import ss6_ke_thua_trong_java.bai_tap.CircleAndCylinder.Circle;

import java.util.Arrays;
import java.util.Comparator;


public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6 , "red");
        circles[1] = new Circle(8.6 , "green");
        circles[2] = new Circle(3.5, "indigo");

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
