package head_13.example13_10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Pasha on 12.10.2016.
 */
public class WorkClass {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Continued [y/n]? ");
                String init = scanner.nextLine();
                if (init.equalsIgnoreCase("y"))
                    break;
                else if (init.equalsIgnoreCase("n"))
                    System.exit(0);
            }
            System.out.print("Input string: ");
            String string = scanner.nextLine();
            System.out.print("Input regular: ");
            String reg = scanner.nextLine();
            //System.out.println("String: \"" + string + "\", regular: \"" + reg + "\"");
            Pattern pattern = Pattern.compile(reg);
            Matcher matcher = pattern.matcher(string);
            while (matcher.find()) {
                System.out.println("Match: \"" + matcher.group() + "\", position " + matcher.start() + " - " + (matcher.end() - 1));
            }
            System.out.println();
        }
    }
}
