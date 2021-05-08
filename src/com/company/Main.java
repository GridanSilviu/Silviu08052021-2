package com.company;

public class Main {

    public static int calculateYearOfBirt(int courentYear, int age) {
        return courentYear - age;
    }

    public static void main(String[] args) {
        int age = 47;
        int courentYear = 2021;

        int result = calculateYearOfBirt(courentYear, age);
        System.out.println(result);
    }
}