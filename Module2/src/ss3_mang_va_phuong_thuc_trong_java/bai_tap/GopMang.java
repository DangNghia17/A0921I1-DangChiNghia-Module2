package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {


    int[] array1 = new int[3];
    int[] array2 = new int[6];
    int[] array3 = new int[array1.length + array2.length];
        System.out.print("Mảng 1 : ");
        for (int i = 0; i < array1.length; i++) {
        array1[i] = i + 1;
        array3[i] = array1[i];
        System.out.print(array1[i] + ",");

    }
        System.out.print("\nMảng 2 : ");
        for (int i = 0; i < array2.length; i++) {
        array2[i] = i + 4;
        System.out.print(array2[i] + ",");
    }

        for (int i = 0; i < array2.length; i++) {
        array3[array1.length + i] = array2[i];
        }

        System.out.print("\nMảng mới sau khi gộp là : " + Arrays.toString(array3));

    }
}
