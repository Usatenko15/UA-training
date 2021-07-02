import java.util.ArrayList;

public class Model {
    private int value;

    private int maxRange = 100;
    private int minRange = 0;

    private int rand = (int) (Math.random() * 101);

    public int getRand() {
        return rand;
    }

    private ArrayList<Integer> listOfTries = new ArrayList<>();

    public ArrayList<Integer> getListOfTries() {
        return listOfTries;
    }

    public boolean checkValue(int value) {

        if (value == rand) {
            return false;
        } else if (value > rand) {
            maxRange = value;
        } else {
            minRange = value;
        }
        return true;
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

}
