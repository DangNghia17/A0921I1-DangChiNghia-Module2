package ss4_lop_va_doi_tuong_trong_java.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class RunningQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a : ");
        double a = sc.nextDouble();
        System.out.print("Input b : ");
        double b = sc.nextDouble();
        System.out.print("Input c : ");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation1 = new QuadraticEquation(a , b, c);
        System.out.println(quadraticEquation1.display());
        System.out.println(quadraticEquation1.getResult());

    }
}
