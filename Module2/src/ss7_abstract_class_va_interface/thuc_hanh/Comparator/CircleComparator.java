package ss7_abstract_class_va_interface.thuc_hanh.Comparator;

import ss6_ke_thua_trong_java.bai_tap.CircleAndCylinder.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}

