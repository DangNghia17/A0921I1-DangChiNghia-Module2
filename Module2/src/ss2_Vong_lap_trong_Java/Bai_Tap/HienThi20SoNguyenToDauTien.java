package ss2_Vong_lap_trong_Java.Bai_Tap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        System.out.println("Hiển thị 20 số nguyên tố đầu tiên");
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
            if (count >= 20) {
                break;
            }
            m++;
        }
    }
}
