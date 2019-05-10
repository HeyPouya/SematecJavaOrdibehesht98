package com.sematech.java.basic.lib;

import java.util.Scanner;

public class GetInput {


    public String getString() {
        Scanner s = new Scanner(System.in);
        String temp = s.next();
        return temp;
    }

    public int getInt() {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        return i;
    }


    public Boolean getBool() {
        Scanner s = new Scanner(System.in);
        Boolean b = s.nextBoolean();
        return b;
    }
}
