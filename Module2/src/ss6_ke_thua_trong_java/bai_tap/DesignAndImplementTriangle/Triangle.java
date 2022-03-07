package ss6_ke_thua_trong_java.bai_tap.DesignAndImplementTriangle;

public class Triangle {
    private double side1 = 1.0d;
    private double side2 = 1.0d;
    private double side3 = 1.0d;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        return side1 * side1 * Math.sqrt(3) / 4;
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "cạnh 1 = " + side1 +
                ", cạnh 2 = " + side2 +
                ", cạnh 3 = " + side3 +
                "\n, Diện tích = " + getArea() +
                "\n, Chu vi = " + getPerimeter() +
                "\n}";
    }
}
