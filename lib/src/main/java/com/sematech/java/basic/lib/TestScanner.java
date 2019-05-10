package com.sematech.java.basic.lib;

import java.util.Scanner;

public class TestScanner {


    public static void main(String[] args) {

//        System.out.println("Please enter your age: ");
//
//        Scanner s = new Scanner(System.in);
//
//        int age = s.nextInt();
//
//
//        if (age > 18)
//            System.out.println("Adult");
//        else
//            System.out.println("kid");


//        System.out.print("Please enter your name: ");
//
//        String name = s.next();
//
//        System.out.println("Welcome " + name);


        String a = getName();
        String b = getName();

        sayHello();


    }


    public static void sayHello() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = s.next();
        System.out.println("Welcome " + name);

    }


    public static String getName() {
        Scanner s = new Scanner(System.in);
        String name = s.next();
        return name;
    }

}
