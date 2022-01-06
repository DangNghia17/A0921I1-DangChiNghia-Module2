package ss6_ke_thua.bai_tap.CircleAndCylinder;

public class Cylinder extends Circle {
     private double height = 2.0 ;

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
    public double getVolume(){
        return 2*Math.PI*getRadius()*(getRadius()+height);
    }

    @Override
    public String toString() {
        return "Cylinder " +
                "radius = " + getRadius() +
                ",color = " + getColor() +
                ",height = " + height +
                ", area = " + getArea() +
                ", perimeter = " +getPerimeter() +
                ", volume =  " + getVolume()
                ;
    }
}
