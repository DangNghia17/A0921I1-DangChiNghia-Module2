package ss15_debug_exception.thuc_hanh.ClassNumberFormatException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        try {
            System.out.println("Hãy nhập x: ");
            x = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("Vui lòng nhập số !!");
        }

        try {
            System.out.println("Hãy nhập y: ");
            y = scanner.nextInt();
        }catch (Exception e){
            System.err.println("Đã xảy ra lỗi gì đó ");
        }
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);

    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
