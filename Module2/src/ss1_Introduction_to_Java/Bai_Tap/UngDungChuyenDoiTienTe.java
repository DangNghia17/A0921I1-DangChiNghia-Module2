package ss1_Introduction_to_Java.Bai_Tap;

import java.util.Scanner;

class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        float USD, VND;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number USD you want to change :");
        USD = sc.nextFloat();
        VND = USD * 23000;
        System.out.println("Value USD after change to VND is : " + VND + " VND");
    }
}