package head_13.example13_3;

import java.io.PrintStream;
import java.util.Formatter;
import java.util.StringJoiner;

/**
 * Created by Pasha on 09.10.2016.
 */
public class WorkClass {
    public static void main(String[] args) {
        int x = 10;
        double y = 0.115;
        String str = "hello";
        System.out.printf("Using System.out.printf: x = %10d, y = %1.2f.\n", x, y);
        System.out.format("Using System.out.format: x = %-10d, y = %1.3f.\n", x, y);
        PrintStream ps = new PrintStream(System.out);
        Formatter formatter = new Formatter(ps);
        Formatter formatter2 = new Formatter(System.out);
        formatter.format("Using class Formatter: x = %d, y = %1.2f, str = %.3s.\n", x, y, str);
        formatter2.format("Using class Formatter: x = %d, y = %.2f.\n", x, y);
        System.out.println(String.format("Using String.format: x = %d, y = %.2f.", x, y));
    }
}
