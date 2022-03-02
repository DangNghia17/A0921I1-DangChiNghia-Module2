package ss6_ke_thua_trong_java.bai_tap.CircleAndCylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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

    public double getPerimeter() {
        return 2 * radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", color = " + color +
                ", Perimeter = " + getPerimeter() +
                ", Area = " + getArea() +
                '}';
    }
}
