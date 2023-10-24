package ss18_Regular_Expresion.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_NAME_REGEX = "[CAP][0-9]{4}[GHIK]$";


    public boolean validate(String regex) {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
