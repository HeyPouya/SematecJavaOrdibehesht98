package com.sematech.java.basic.lib;

import java.util.Scanner;

public class TestMethod {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int c = min(a, b);
        System.out.println(c);
    }


    /**
     * this is the minus method
     *
     * @param firstNumber  this is the first number
     * @param secondNumber this is the second  number
     * @return first - second
     */
    public static int min(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int calculateAge(int birthYear) {
        return min(2019, birthYear);
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double sumDouble(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void printName(String name) {
        System.out.print("Hello " + name);
    }

    public static String generateSalute(String name) {
        return "Hello " + name;
    }


}
