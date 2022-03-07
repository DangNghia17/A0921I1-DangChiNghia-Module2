package ss7_abstract_class_va_interface.thuc_hanh.Comparable;

import ss6_ke_thua_trong_java.bai_tap.CircleAndCylinder.Circle;

public class ComparableCircle extends Circle
            implements Comparable<ComparableCircle>{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius, String color) {
        super(radius, color);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
