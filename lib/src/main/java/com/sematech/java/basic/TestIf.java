package com.sematech.java.basic;

public class TestIf {


    public static void main(String[] args) {

        int a = 2;
        int b = 1;

        if (b >= a) {
            System.out.println("1 is greater than 2");
        }

        if (a > b && a == 10) {
            System.out.println("2 is greater than 1");
        }

        if (a != b || b == 3) {
            System.out.println("2 is greater than 1");
        }
        if (a == b) {
            System.out.println("2 is greater than 1");
        }

        String name = "Pouya";

        if (name.equals("Pouya")) {
            System.out.println("same");
        }

        boolean isAdult = false;

        if (isAdult) {
            System.out.println("Adult");
        }

        if (!isAdult) {
            System.out.println("Kid");
        }


        if (1 > 2) {
            System.out.println("1 is greater than 2");
        } else {
            System.out.println("1 is not greater than 2");
        }


        if (1 > 2) {

        } else if (2 > 3) {

        } else if (3 > 4) {

        } else {

        }


    }
}
