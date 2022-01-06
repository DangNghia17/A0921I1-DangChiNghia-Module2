package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int size = 10; // size of array
        int[] mang1 = new int[size]; //khởi tạo 1 mảng có kích thước trước để tăng size khi thêm vào
        mang1[0] = -1;
        mang1[1] = 1;
        mang1[2] = 45;
        mang1[3] = 12;
        mang1[4] = 456;
        mang1[5] = -7897;
        mang1[6] = 1710;
        mang1[7] = 35;
        Scanner sc = new Scanner(System.in);
        int addElement;
        boolean check = false;

        System.out.println("Mảng đã khai báo là : ");
        for (int mangMoi : mang1) {
            System.out.print(mangMoi + ",");
        }
        System.out.println("\t" + "Nhập vị trí bạn muốn thêm vào mảng :");
        int index = sc.nextInt();
        System.out.println("Nhập giá trị bạn muốn thêm tại vị trí " + index);
        addElement = sc.nextInt();
        for (int i = 1; i < mang1.length; i++) {
            if (index < mang1.length && index >= 0) {
                mang1[index] = addElement;
                check = true;
            } else {
                check = false;
            }
        }
        if (check == false) {
            System.out.println("Vui lòng nhập đúng vị trí trong phạm vi độ dài của mảng !");
        } else {
            System.out.println("Đã thêm giá trị " + addElement + " vào vị trí số " + index + " trong mảng");
            System.out.print("Mảng sau khi thêm : ");
            for (int i1 : mang1) {
                System.out.print(i1 + ",");
            }
        }
    }
}

