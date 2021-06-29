package Game;

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

        game();

        view.printMessage(View.WIN_TEXT);
        view.printMessage(View.ATTEMPTS_NUMBER_TEXT, model.getListOfTries().size());
        view.printMessage(View.STATISTIC_TEXT, model.getListOfTries());



    }
    public void game(){
        Scanner sc = new Scanner(System.in);
        view.printMessageAndInt(View.INPUT_INT_DATA, model.getMinRange(), model.getMaxRange());
        model.setValue(isInRange(inputIntValueWithScanner(sc)));
        while (model.getValue()!=model.getRand()){
            if (model.getValue()>model.getRand()){
                model.setMaxRange(model.getValue());
                view.printMessage(View.STATISTIC_TEXT, model.getListOfTries());
                game();

            }
            if (model.getValue()<model.getRand()){
                model.setMinRange(model.getValue());
                view.printMessage(View.STATISTIC_TEXT, model.getListOfTries());
                game();
            }

        }
    }

    public int inputIntValueWithScanner(Scanner sc) {
        while (!sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessageAndInt(View.INPUT_INT_DATA, model.getMinRange(), model.getMaxRange());
            sc.next();
        }
        return sc.nextInt();
    }

    public int isInRange(int value) {
        if (value >= model.getMinRange() && value <= model.getMaxRange()) {
            return value;
        }
        view.printMessage(View.OUT_OF_RANGE);
        view.printMessageAndInt(View.INPUT_INT_DATA, model.getMinRange(), model.getMaxRange());
        Scanner sc = new Scanner(System.in);
        return isInRange(inputIntValueWithScanner(sc));
    }

}
