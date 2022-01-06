package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        int[] array3 = new int[array1.length + array2.length];
        System.out.print("Mảng 1 : ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
            array3[i] = array1[i];
            System.out.print(array1[i] + ",");

        }
        System.out.print("\t" + "Mảng 2 : ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 4;
            System.out.print(array2[i] + ",");
        }
    /**anh chánh review tới đoạn này anh hướng dẫn em gán cho đúng vị trí dùm với nha anh**/
        for (int i = 0; i < array1.length; i++) {
            array3[array2.length + i] = array2[i];
        }

        System.out.print("Mảng mới sau khi gộp là : ");
        for (int a3 : array3) {
            System.out.print(a3 + ",");
        }

    }
}
