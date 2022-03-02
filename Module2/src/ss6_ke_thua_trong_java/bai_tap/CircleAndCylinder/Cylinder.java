package ss6_ke_thua_trong_java.bai_tap.CircleAndCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return (getRadius() * getRadius()) * getHeight() * 3.14; //pi * r^2 * h
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius = " + getRadius() +
                " , height = " + height +
                " , color = " + getColor() +
                " , Volume = " + getVolume() +
                '}';
    }
}
