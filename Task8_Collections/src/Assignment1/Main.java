package Assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = Stream.of(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7)
                .collect(Collectors.toCollection(ArrayList::new));

        calculateSameValues(arrayList);

    }

    public static void calculateSameValues( ArrayList<Integer> arrayList) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        arrayList.forEach(value ->{
            if(!hashMap.containsKey(value)){
                hashMap.put(value, 1);
            }
            else {
                hashMap.put(value,hashMap.get(value)+1);
            }
        });
        System.out.println(hashMap);
    }
}
