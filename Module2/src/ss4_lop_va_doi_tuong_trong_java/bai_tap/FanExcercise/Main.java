package ss4_lop_va_doi_tuong_trong_java.bai_tap.FanExcercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chế độ quạt muốn bật :");
        boolean on = sc.nextBoolean();
        System.out.println("Nhập bán kính quạt muốn :");
        double radius = sc.nextDouble();
        System.out.println("Nhập màu quạt muốn :");
        String color = sc.nextLine();
        Fan fan1 = new Fan(on, radius, color);
        Fan fan2 = new Fan(on, radius, color);
        System.out.println(fan1);
        System.out.println(fan2);
    }


}
