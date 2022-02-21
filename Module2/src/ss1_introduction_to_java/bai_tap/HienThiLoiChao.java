package ss1_introduction_to_java.bai_tap;
import java.util.Scanner ;
class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên của bạn ");
        String name = sc.nextLine();
        System.out.println("Hello: " + name);
    }
}
//