package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

public class GiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] array = {1,2,5,-55,488,7788,89877,-88,455,9977,-97,898};
        int min = 0;
        for (int i = 0; i <array.length ; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("GTNN là : " + min);
    }
}
