package ss7_abstract_class_va_interface.bai_tap.Resizeable;

public class RunningResizeable {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        c1.resize(50);
        System.out.println(c1);

        Rectangle r1 = new Rectangle(5.5 , 6.3);
        r1.resize(30);
        System.out.println(r1);

        Square s1 = new Square(10.3);
        s1.resize(65);
        System.out.println(s1);
    }
}
