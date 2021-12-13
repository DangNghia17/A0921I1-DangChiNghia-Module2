package ss3_Mang_va_phuong_thuc_trong_Java.Bai_Tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] mang1 = {1, 2, 3, 45, 12, 7567, 641, 1231};
        int numDelete;
        boolean check = false;
        System.out.print("Mảng đã khai báo là : ");
        for (int i = 0; i < mang1.length; i++) {
            System.out.print(mang1[i] + ",");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("\t" + "Nhập giá trị bạn muốn xóa : ");
        numDelete = sc.nextInt();
        for (int i = 0; i < mang1.length; i++) {
            if (numDelete == mang1[i]) {
                System.out.println("Đã xóa " + numDelete + " tại vị trí số " + (i + 1) + " trong mảng");
                mang1[i] = mang1[i + 1];
            }
        }
        System.out.println("Mảng mới hiện tại là : ");
        check = true;
        for (int mangMoi : mang1) {
            System.out.print(mangMoi + ",");
        }
        if (check == false) {
            System.out.println("Không tìm thấy giá trị muốn xóa trong mảng !! ");
        }
    }
}
