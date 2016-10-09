package head_13.example13_9;

import java.util.Arrays;

/**
 * Created by Pasha on 10.10.2016.
 */
public class WorkClass {
    public static void main(String[] args) {
        //The description of regular expressions in class Pattern
        System.out.println("String.matches():");
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("1234".matches("-?\\d+"));
        System.out.println("+1234".matches("-?\\d+"));
        System.out.println("+1234".matches("(-|\\+)?\\d+"));
        String str = "Help people interested, in this repository understand your project by adding a README.";
        System.out.println("\nString.split():");
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(Arrays.toString(str.split("\\W+")));
        System.out.println(Arrays.toString(str.split("d\\W+")));
        System.out.println("\nString.replace():");
        System.out.println(str.replaceFirst(" r\\w+", " banana"));
        System.out.println(str.replaceAll(" p\\w+", " banana"));
    }
}
