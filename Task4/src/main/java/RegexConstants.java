import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Student on 04.07.2021.
 *
 * @author  Usatenko Vladyslav
 */
public interface RegexConstants {
    Pattern P_USER_NAME = Pattern.compile("^[a-z0-9_-]{3,16}$");
    Pattern P_LAST_NAME = Pattern.compile("[A-Za-z]{2,}");


}
