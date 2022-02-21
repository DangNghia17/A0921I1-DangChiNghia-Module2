package ss2_vong_lap_trong_java.thuc_hanh;

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
            boolean isPrime = true;

            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime)
                System.out.println(num + " là số nguyên tố!!");
            else
                System.out.println(num + " là số nguyên tố !!");

    }}
}
