package ss2_Vong_lap_trong_Java.Thuc_Hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên để kiểm tra");
        int num = sc.nextInt();

        if (num < 2){
            System.out.println(num + " không phải là số nguyên tố !");
        } else {
            int i = 2;
            boolean check = true;

            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(num + " là số nguyên tố!!");
            else
                System.out.println(num + " là số nguyên tố !!");

    }}
}
