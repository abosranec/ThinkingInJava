package test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Pasha on 02.02.2016.
 */
public class FirstClass {
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }
    public static void main(String[] args) {
        while(condition())
            System.out.println("Inside 'while'");
        System.out.println("Exited 'while'");
        String s = "sdf sfdds sdf sdfsdfs ffefe sdfsdfs";
        System.out.println(Arrays.toString(s.split(" ")));
        for (String str: s.split(" ")) {
            System.out.print(str + " ");
        }
    }
} /* (Execute to see output) *///:~