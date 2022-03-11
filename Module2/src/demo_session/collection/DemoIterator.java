package demo_session.collection;


import ss6_ke_thua_trong_java.bai_tap.CircleAndCylinder.Circle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(5,"yellow"));
        circles.add(new Circle(70,"red"));
        circles.add(new Circle(8.8,"green"));
        circles.add(new Circle(15,"yellow"));
        Iterator<Circle> iterator = circles.iterator();
        while (iterator.hasNext()) {
            Circle c1 = iterator.next();
            System.out.println(c1);
        }
    }
}
