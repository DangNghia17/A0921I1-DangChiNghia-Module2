package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {1, 22, 11, 5, 6, 898, 454, 5, 20};
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào phần tử cần xóa trong mảng : ");
        int itemDelete = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == itemDelete) {
                count++;
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                i--;
            }
        }

        for (int i = 1; i <= count; i++) {
            arr[arr.length - i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

