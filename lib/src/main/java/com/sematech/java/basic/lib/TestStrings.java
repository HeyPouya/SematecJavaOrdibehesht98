package com.sematech.java.basic.lib;

public class TestStrings {


    public static void main(String[] args) {
        String name = "PouyA";


        if (name.equals("pouya")) {
            //its false
        }


        if (name.equalsIgnoreCase("pouya")) {
            //its true
        }

        if (name.contains("o") || name.contains("O")) {
            //true
        }

    }
}
