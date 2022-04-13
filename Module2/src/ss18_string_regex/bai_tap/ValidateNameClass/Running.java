package ss18_string_regex.bai_tap.ValidateNameClass;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Running {
    public static void main(String[] args) {
        System.out.println("Nhập lớp bạn cần kiểm tra đúng định dạng không ? : ");
        Scanner scanner = new Scanner(System.in);
        String nameClass = scanner.nextLine();
        NameClassConstruc nameClass1 = new NameClassConstruc();
        nameClass1.validate(nameClass);

    }
}
