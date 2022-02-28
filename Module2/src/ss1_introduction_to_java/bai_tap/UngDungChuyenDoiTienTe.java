package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        float usd, vnd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number USD you want to change :");
        usd = sc.nextFloat();
        vnd = usd * 23000;
        System.out.println("Value USD after change to VND is : " + vnd + " VND");
    }
}
//