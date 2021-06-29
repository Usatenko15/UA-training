package Game;

import java.util.ArrayList;

public class Model {
    private int value;
    private int maxRange = 100;
    private int minRange = 0;
    private int rand = (int) (Math.random()*101);

    public ArrayList<Integer> getListOfTries() {
        return listOfTries;
    }

    private ArrayList<Integer> listOfTries = new ArrayList<>();

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public void setMinRange(int minRange) {
        this.minRange = minRange;
    }

    public int getRand() {
        return rand;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getMinRange() {
        return minRange;
    }

    public void setValue(int value) {

        this.value = value;
        listOfTries.add(value);
    }

    public int getValue() {
        return value;
    }



}
