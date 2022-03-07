package ss7_abstract_class_va_interface.thuc_hanh.Comparable;

import java.util.Arrays;

public class RunningComparable {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.5, "red + yellow");
        circles[1] = new ComparableCircle(5, "blue");
        circles[2] = new ComparableCircle(8.8, "white");

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
