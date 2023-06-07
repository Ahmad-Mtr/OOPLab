package Mavenproject10;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex1 {

    public static void main(String[] args) {

        int x[];
        x = new int[10];
        int c = 0;
//        String h="123";
//        h.charAt(12);

        try {
            System.out.println(x[12]);
            System.out.println("1");
            System.out.println("2");
            int y = 10 / c;
            System.out.println(y);
        } catch (Exception v) {
            System.out.println("Error1");
        } 
        System.out.println("3");

    }

}
