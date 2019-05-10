package com.sematech.java.basic.lib;

public class TestWhile {

    public static void main(String[] args) {
        Boolean b = true;

        int a = 0;

        while (b) {
            System.out.println("Something");
            a = a + 1;
            if (a > 10)
                b = false;
        }


        do {
            System.out.println("Something");
            a = a + 1;
            if (a > 10)
                b = false;
        } while (b);






        while (a < 10) {
            //
            a = a + 1;
        }

//        while (true){
//            //
//
//        }

        int age = 13;

        if (age > 18)
            b = true;
        else
            b = false;


        while (b) {
            System.out.println("Hello");

        }


        do {
            System.out.println("Hello");
        } while (b);


    }
}
