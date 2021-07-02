import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {
        view.printMessage(View.ABOUT_GAME);
        Scanner sc = new Scanner(System.in);

        while (model.checkValue(isInRange(inputIntValueWithScanner(sc)))) ;

        view.printMessage(View.WIN_TEXT);
        view.printMessage(View.ATTEMPTS_NUMBER_TEXT, model.getListOfTries().size());
        view.printMessage(View.STATISTIC_TEXT, model.getListOfTries());

    }

    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessageAndInt(View.INPUT_INT_DATA, model.getMinRange(), model.getMaxRange());
        while (!sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessageAndInt(View.INPUT_INT_DATA, model.getMinRange(), model.getMaxRange());
            sc.next();
        }
        return sc.nextInt();
    }

    public int isInRange(int value) {

        if (value >= model.getMinRange() && value <= model.getMaxRange()) {
            model.setValue(value);
            view.printMessage(View.STATISTIC_TEXT, model.getListOfTries());
            return value;
        }
        view.printMessage(View.OUT_OF_RANGE);
        view.printMessageAndInt(View.INPUT_INT_DATA, model.getMinRange(), model.getMaxRange());
        Scanner sc = new Scanner(System.in);
        return isInRange(inputIntValueWithScanner(sc));
    }
}
