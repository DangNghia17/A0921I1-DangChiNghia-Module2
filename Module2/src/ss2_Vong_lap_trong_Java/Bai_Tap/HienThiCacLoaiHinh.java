package ss2_Vong_lap_trong_Java.Bai_Tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
    int choice = -1;
    Scanner input = new Scanner(System.in);
    while(choice != 0) {
        System.out.println("Menu");
        System.out.println("1. Vẽ hình vuông");
        System.out.println("2. Vẽ hai hình tam giác vuông ");
        System.out.println("3. Vẽ hình tam giác cân");
        System.out.println("0. Thoát");
        System.out.println("Nhập vào số bạn chọn: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 7; j ++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Vuông góc dưới bên phải:");
                for(int i = 0; i < 5; i++){
                    for(int j = 0; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println("--------------------------------");
                System.out.println("Vuông góc trên bên phải:");
                for (int i = 5; i > 0; i--){
                    for (int j = 0; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for(int i = 1; i <= 5; i++){
                    for(int j=1;j<=5-i;j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=2*i-1;j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Vui lòng chỉ nhập từ 0 đến 4 !");
        }
    }}
}
