package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        int size ;
        int[] array ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào độ dài của mảng muốn tạo :");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("Độ dài của mảng không được lớn hơn 20 !!");
            }
        }while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập giá trị thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.printf("%-20s%s", "Các thành phân trong mảng là : ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }

}
