package ss5_access_modifier_static_method_static_property.bai_tap.AccessModifier;

public class RunningCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(5);

        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());

    }
}
