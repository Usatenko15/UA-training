package com.company.part1;

public class App3 {
    public static void main(String[] args) {
        area(-4,5);
    }

    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
        return width * height;
    }
}
