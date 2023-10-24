package ss18_Regular_Expresion.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private Pattern pattern;
    private Matcher matcher;
    private static final String PHONE_NUMBER_REGEX = "^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";


    public boolean validate(String regex) {
        pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
