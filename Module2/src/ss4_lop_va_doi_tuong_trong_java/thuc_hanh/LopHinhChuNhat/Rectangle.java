package ss4_lop_va_doi_tuong_trong_java.thuc_hanh.LopHinhChuNhat;

public class Rectangle {
    double width, height;
    //method khi ko có tham số
    public Rectangle() {
    }
    // method được gọi khi có 2 tham số
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}