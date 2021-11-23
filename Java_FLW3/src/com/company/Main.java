package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        // write your code here
        char c2;
        byte b;
        float f;
        int i = -500;



        f = (float) ((Math.random()*(1-1000000))+ 1000000);
        System.out.println("f = "+f);
        i = Math.round(f);
        System.out.println("new i = "+i);
        b = (byte) i;
        System.out.println("new b = "+b);

        double y = Math.pow((double) i, (double) 5)/Math.log((double) f) - Math.sin((double) f)/b;
        System.out.println("y = "+y);
    }
}
