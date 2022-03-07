package ss7_abstract_class_va_interface.bai_tap.Resizeable;

public class Square extends Shape implements Resizeable {
    private double width = 1.0;

    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }

    public Square(double width, String color, boolean filled) {
        super(color, filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double getArea() {
        return width * width;
    }

    public double getPerimeter() {
        return 4 * width;
    }

    @Override
    public String toString() {
        return "A Square with width="
                + getWidth()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("the size up " + percent + "%");
        this.width += width * percent;
    }

}
