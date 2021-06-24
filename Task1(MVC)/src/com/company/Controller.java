package com.company;

import java.util.Scanner;

public class Controller {
    // The Constants
    public static final String HELLO_VALUE = "Hello";
    public static final String WORLD_VALUE = "world!";

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    // The Work method
    public void selectHelloAndWorld(){
        Scanner sc = new Scanner(System.in);

        view.printMessage(view.INPUT_HELLO);
        while( ! sc.next().equals(HELLO_VALUE)) {
            view.printMessage(View.WRONG_INPUT_STRING_DATA+View.INPUT_HELLO);
        }
        model.setValueHello(HELLO_VALUE);

        view.printMessage(view.INPUT_WORLD);
        while( ! sc.next().equals(WORLD_VALUE)) {
            view.printMessage(View.WRONG_INPUT_STRING_DATA+View.INPUT_WORLD);
        }
        model.setValueWorld(WORLD_VALUE);
        model.finalSum();
    }
}
