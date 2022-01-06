package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimUocSoChungLonNhat {
    public static void main(String[] args) {
        System.out.println("Đây là chương trình tìm ước chung lớn nhất");
        int a;
        int b;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập giá trị a : ");
        a = input.nextInt();
        System.out.println("Nhập giá trị b : ");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không tìm ước chung lớn nhất vì có 1 giá trị bằng 0 !");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Ước chung lớn nhất là: " + a);
    }
}
