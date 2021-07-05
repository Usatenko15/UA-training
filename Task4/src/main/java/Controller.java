import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * Created by Student on 04.07.2021.
 *
 * @author  Usatenko Vladyslav
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        inputLastNameCheck(sc);
        inputUserNameCheck(sc);

    }

    private void inputUserNameCheck(Scanner sc) {
        view.printMessage(View.USER_NAME_INPUT);
        String res = sc.next();
        Matcher userName = RegexConstants.P_USER_NAME.matcher(res);
        if (userName.matches()) model.setUserName(res);
        else inputUserNameCheck(sc);
    }

    private void inputLastNameCheck(Scanner sc) {
        view.printMessage(View.LAST_NAME_INPUT);
        String res = sc.next();
        Matcher lastName = RegexConstants.P_LAST_NAME.matcher(res);
        if (lastName.matches()) model.setLastName(res);
        else inputLastNameCheck(sc);
    }


}
