package Game;

import java.util.ArrayList;

public class View {
    public static final String ABOUT_GAME = "The computer riddled the number.Your task is to guess the number." +
            " After each attempt the computer will tell you in what range the number is.";
    public static final String INPUT_INT_DATA = "Enter a natural number in range from ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
    public static final String OUT_OF_RANGE = "The number is out of range";
    public static final String WIN_TEXT = "Congratulations, you won!";
    public static final String ATTEMPTS_NUMBER_TEXT = "Number of attempts: ";
    public static final String STATISTIC_TEXT = "List of your inputs: ";

    public void printMessage(String message){
        System.out.println(message);
    }
    public void printMessage(String message, ArrayList<Integer> list){
        System.out.println(message + list);
    }
    public void printMessage(String message, int value){
        System.out.println(message + value);
    }
    public void printMessageAndInt(String message, int value1, int value2) {
        System.out.println(message + value1 + " to " + value2);
    }
    }
