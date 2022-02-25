package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class RunningRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the width: ");
        double width = sc.nextDouble();
        System.out.print("Input the height: ");
        double height = sc.nextDouble();
        Rectangle rec1 = new Rectangle(width,height);
        System.out.println("Your Rectangle \n"+ rec1.display());
    }
}
