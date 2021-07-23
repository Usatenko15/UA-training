package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] array = new int[] {1,43,56,32,3,0,32,4,0,32,64,45};
        System.out.println("Average value of the array: " +
                Arrays.stream(array).average().getAsDouble());
        System.out.println("Number of values that are equal to zero: " +
                Arrays.stream(array).filter(x->x==0).count());
        System.out.println("Number of values greater then zero: " +
                Arrays.stream(array).filter(x->x>0).count()+"\n" );

        int multiplyConstant = 10;
        Arrays.stream(array).map(x->x*multiplyConstant).forEach(System.out::println);





    }
}
