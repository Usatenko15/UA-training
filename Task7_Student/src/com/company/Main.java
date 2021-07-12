package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ColorEyes colorEyes = new ColorEyes("fss");
        Student student = new Student("ewe", 24, "sosi", colorEyes);
        Student student1 = new Student("wew", 45, "sosi",colorEyes);
        System.out.println(student.hashCode()==student1.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student.equals(student1));
        student.getColorEyes();
        student.getColorEyes();
    }
}
