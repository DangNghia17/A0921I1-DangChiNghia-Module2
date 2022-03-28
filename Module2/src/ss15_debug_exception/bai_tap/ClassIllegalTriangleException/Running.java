package ss15_debug_exception.bai_tap.ClassIllegalTriangleException;

import ss4_lop_va_doi_tuong_trong_java.thuc_hanh.Rectangle;

import java.util.Scanner;

public class Running {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double width = 0;
        double height = 0;
        String color = null;

        System.out.print("Input the width: ");
        width = sc.nextDouble();
        System.out.print("Input the height: ");
        height = sc.nextDouble();
        System.out.print("Input the color: ");
        String color1 = sc.nextLine();
        color = sc.nextLine();

        if (width < 0 || height < 0 || width + height <= 0) {
            throw new Exception("có lỗi về input !!" );
        }


        RectangleSession15 rec1 = new RectangleSession15(width, height, color);
        System.out.println(rec1.display());
    }
}
