package ss5_access_modifier_static_method_static_property.bai_tap.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle ht1 = new Circle(2.0);
        System.out.println("Chu vi hình tròn là : " + ht1.getRadius());

        Circle ht2 = new Circle(5.0);
        System.out.println("Diện tích hình tròn là : " + ht2.getArea());
    }
}
