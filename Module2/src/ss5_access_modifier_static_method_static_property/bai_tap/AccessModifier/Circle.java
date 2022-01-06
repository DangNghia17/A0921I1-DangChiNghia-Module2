package ss5_access_modifier_static_method_static_property.bai_tap.AccessModifier;

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
