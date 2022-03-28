package ss15_debug_exception.bai_tap.ClassIllegalTriangleException;

public class RectangleSession15 {
    private double width;
    private double height;
    private String color;

    public RectangleSession15() {
    }

    public RectangleSession15(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return (this.width * this.height);
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String display() {
        return "\nRectangle :" +
                "\n Width is : " + getWidth() +
                "\n Height is : " + getHeight() +
                "\n Area is : " + getArea() +
                "\n Perimeter is : " + getPerimeter() +
                "\n Color is : " + getColor();
    }

}

