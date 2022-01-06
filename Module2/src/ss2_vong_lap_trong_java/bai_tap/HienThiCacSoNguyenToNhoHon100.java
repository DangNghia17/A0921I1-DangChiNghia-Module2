package ss2_vong_lap_trong_java.bai_tap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Hiển thị các số nguyên tố nhỏ hơn 100 ");
        int count = 0;
        int m = 2;
        while (true) {
            int mark = 1;
            for(int i = 2; i <= Math.sqrt(m); i++){
                if (m % i == 0) {
                    mark = 0;
                    break;
                }
            }
            if(mark == 1){
                count++;
                System.out.print(m + ", ");
            }
            if (m >= 100) {
                break;
            }
            m++;
        }
    }
}
