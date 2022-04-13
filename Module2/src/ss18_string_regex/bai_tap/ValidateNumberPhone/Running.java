package ss18_string_regex.bai_tap.ValidateNumberPhone;

import java.util.Scanner;

public class Running {
    public static void main(String[] args) {
        System.out.println("Nhập số điện thoại cần kiểm tra đúng định dạng không ? : ");
        Scanner scanner = new Scanner(System.in);
        String numbersPhoneInput = scanner.nextLine();
        NumberPhoneConstruc numberPhone = new NumberPhoneConstruc();
        numberPhone.checkNumberPhone(numbersPhoneInput);
    }
}
