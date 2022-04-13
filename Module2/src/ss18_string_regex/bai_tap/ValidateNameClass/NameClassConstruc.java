package ss18_string_regex.bai_tap.ValidateNameClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClassConstruc {
    public static final String NAMECLASS_REGEX = "^[CAP]+[\\d]{4}+[G-M]$";
    public NameClassConstruc() {
    }
    public void validate(String regex) {
        if (Pattern.matches(NAMECLASS_REGEX, regex)) {
            System.out.println("Tên lớp đúng định dạng !! ");
        } else {
            System.out.println("Tên lớp không đúng định dạng!!");
        }
    }
}
