package ss3_Mang_va_phuong_thuc_trong_Java.Thuc_Hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Nghia", "Hoa", "Linh", "Hau", "Tuan", "Khoa", "Trang", "Mil", "Hung", "Uyen"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên mà bạn muốn tìm : ");
        String inputName = sc.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println(inputName + " muốn tìm nằm ở vị trí số " + (i + 1) + "trong mảng");
                isExist = true;
                break;
            }

        }
        if (!isExist) {
            System.out.println("Không tìm thấy tên " + inputName + "trong mảng ");
        }
    }
}
