package ss5_Access_modifier_static_method_static_property.Bai_Tap.AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    };

    public Circle(double radius) {

    };

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius * 2 * 3.14;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }

    ;
}
