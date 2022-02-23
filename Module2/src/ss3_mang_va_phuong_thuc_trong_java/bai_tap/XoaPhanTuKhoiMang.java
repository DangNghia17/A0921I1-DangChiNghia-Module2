package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = new int[8];
        array[0] = 10;
        array[1] = 0;
        array[2] = 12;
        array[3] = 123;
        array[4] = 56;
        array[5] = 76;
        array[6] = 87;
        array[7] = 67;

        boolean check = false;
        int DeleteNum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Mảng đã khai báo là : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
        System.out.println("\nNhập vào phần tử cần xóa trong mảng : ");
        DeleteNum = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (DeleteNum == array[i]) {
                System.out.println("Đã xóa " + DeleteNum + " tại vị trí số " + (i + 1) + " trong mảng");
                array[i] = array[i + 1];
                check = true;
                break;
            }
        }
        if (check) {
            System.out.print("Mảng sau khi xóa là : ");
            for (int arraynew : array) {
                System.out.print(arraynew + ",");
            }
        } else {
            System.out.println("Không tìm thấy giá trị!!");
        }
    }
}
