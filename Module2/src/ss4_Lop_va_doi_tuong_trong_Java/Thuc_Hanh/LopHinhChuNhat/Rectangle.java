package ss4_Lop_va_doi_tuong_trong_Java.Thuc_Hanh.LopHinhChuNhat;

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
