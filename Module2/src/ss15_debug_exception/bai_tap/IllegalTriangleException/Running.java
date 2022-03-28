package ss15_debug_exception.bai_tap.IllegalTriangleException;

import java.util.Scanner;

public class Running {
    public static void main(String[] args) {
        Running r1 = new Running();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a , b , c to cal Triangle");
        System.out.println("Input a : ");
        double a = sc.nextDouble();
        System.out.println("Input b : ");
        double b = sc.nextDouble();
        System.out.println("Input c : ");
        double c = sc.nextDouble();
        try{
            r1.checkNum(a,b,c);
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }


    public void checkNum(double a, double b, double c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0 || a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Tam giác không hợp lệ");
        } else {
            System.out.println("Tam giác hợp lệ");
        }
    }
}

