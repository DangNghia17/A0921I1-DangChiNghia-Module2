package ss4_lop_va_doi_tuong_trong_java.bai_tap.XayDungLopQuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a:");
        double a = sc.nextDouble();
        System.out.println("Nhập giá trị b:");
        double b = sc.nextDouble();
        System.out.println("Nhập giá trị c:");
        double c = sc.nextDouble();
        XayDungLopQuadraticEquation pt1 = new XayDungLopQuadraticEquation(a, b, c);
        System.out.println(pt1.display());
        System.out.println(pt1.getResult());
    }
}
