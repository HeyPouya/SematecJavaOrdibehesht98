package com.sematech.java.basic.lib;

import java.util.ArrayList;

public class MyMainClass {

    public static void main(String[] args) {


        GetInput input = new GetInput();
        int a = input.getInt();
        int b = input.getInt();


        //instance or object
        TestCalculator c = new TestCalculator();
        c.minus(a, b);
        c.plus(a, b);


        ArrayList<String> list = new ArrayList<String>();

        list.add("Pouya");
        list.add("Qoli");
        list.add("Ali");

        for (int i = 0;i<list.size();i++){

            String s = list.get(i);
            System.out.println(s + i);
        }





    }
}
