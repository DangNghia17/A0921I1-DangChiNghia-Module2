package ss6_ke_thua.bai_tap.DesignAndImplementTriangle;

public class Shape {
    private String color = "Yellow";

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "Màu sắc của hình là : '" + color + '\'' +
                '}';
    }
}
