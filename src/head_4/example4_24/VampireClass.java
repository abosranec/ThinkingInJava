package head_4.example4_24;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Pasha on 11.02.2016.
 * Class to find all the vampires in the command line
 */
public class VampireClass {
    public static int count;
    public static void main(String[] args) {
        System.out.println("All found vampires for " + args[0] + " numbers:");
        long ipow = (long)Math.pow(10, Integer.parseInt(args[0]));
        for (long i = 0; i < ipow/10; i++) {
            for (long j = i; j < ipow/10; j++) {
                if (((i * j) > (ipow/10 - 1)) && ((i * j) < ipow)) {
                    vampire(i, j, (i * j));
                }
            }
        }
        System.out.println("All vampires: " + count);
    }
    public static void vampire(long ci, long cj, long cij) {
        ArrayList<Character> list = (new ArrayList<Character>());
        char[] chij = ("" + cij).toCharArray();
        for (int i = 0; i < chij.length; i++) {
            list.add(chij[i]);
        }
        ArrayList<Character> listij = new ArrayList<Character>();
        char[] ch = ("" + ci + cj).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            listij.add(ch[i]);
        }
        if ((chij.length == ch.length) && (list.containsAll(listij))) {
            //list.removeAll(listij);
            for (int i = 0; i < chij.length; i++) {
                list.remove(listij.get(i));
            }
            if (list.size() == 0) {
                System.out.println("i*j = " + cij + ", i = " + ci + ", j = " + cj);
                count++;
            }
        }
    }
}
