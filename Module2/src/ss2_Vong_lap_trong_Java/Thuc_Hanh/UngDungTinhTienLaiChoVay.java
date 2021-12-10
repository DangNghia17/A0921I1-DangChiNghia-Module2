package ss2_Vong_lap_trong_Java.Thuc_Hanh;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0d;
        int month = 1;
        double interestRate = 1.0d;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập vào số tiền muốn gửi : ");
        money = input.nextDouble();

        System.out.println("Nhập vào số tháng muốn gửi: ");
        month = input.nextInt();

        System.out.println("Nhập lãi suất ngân hàng theo phần trăm: ");
        interestRate = input.nextDouble();

        //calculation
        double cal = 0;
        for(int i = 0; i < month; i++){
            cal += money * (interestRate/100)/12 * month;
        }

        System.out.println("Tổng số tiền lãi là : " + cal + "VNĐ");
    }
}
