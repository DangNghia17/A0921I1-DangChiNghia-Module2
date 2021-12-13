package ss3_Mang_va_phuong_thuc_trong_Java.Thuc_Hanh;

public class TimGiaTriNhoNhatTrongMangSuDungPhuongThuc {


    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng là : " + arr[index] + " nằm ở vị trí thứ " + (index));
    }

    /**
     * Tạo method MinValue
     **/

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i ;
            }
        }
        return index;
    }
}