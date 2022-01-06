package ss6_ke_thua.bai_tap.CircleAndCylinder;

public class Circle {
    private double radius = 3.0 ;
    private String color = "white";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    //method


    public double getRadius() {
        return radius ;
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

    public double getArea (){
        return radius * radius * 3.14;
    };
    public double getPerimeter(){
        return radius * 2 * 3.14;
    };
    @Override
    public String toString() {
        return "Circle " +
                "bán kính = " + radius +
                ", màu sắc ='" + color + '\'' +
                ", điện tích = " + getArea() +
                " , chu vi = " + getPerimeter();
    }
}
