package com.company.part2;

public class App2 {
    public static void main(String[] args) throws Exception {
        f();
    }

    // хотя мы пугали всего-лишь Exception
    public static void f() throws Exception {
        throw new Exception();
    }
}
