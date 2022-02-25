package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
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
        return  (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle :" +
                        "\n Width is : " + getWidth() +
                        "\n Height is : " + getHeight() +
                        "\n Area is : " + getArea() +
                        "\n Perimeter is : " + getPerimeter();
    }

}
