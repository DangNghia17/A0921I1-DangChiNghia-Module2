package ss18_string_regex.bai_tap.ValidateNumberPhone;

import java.util.regex.Pattern;

public class NumberPhoneConstruc {
    private static String NUMBERPHONE_REGEX = "^[(][\\d]{2}[)]-[(]([0]+[\\d]{9})[)]$";
                                         /**   Example to test : (84)-(0978489648)  **/
    public NumberPhoneConstruc() {
    }

    public void checkNumberPhone(String regex) {
        if (Pattern.matches(NUMBERPHONE_REGEX, regex)) {
            System.out.println("Số điện thoại đúng định dạng !! ");
        } else {
            System.out.println("Số điện thoại không đúng định dạng!!");
        }
    }
}
