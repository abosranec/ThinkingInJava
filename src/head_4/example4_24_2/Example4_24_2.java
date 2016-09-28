package head_4.example4_24_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by VitAl on 19.09.2016.
 */
public class Example4_24_2 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            for (int j = 10; j < 100; j++) {
                for (int k = j; k < 100; k++) {
                    if (j * k == i) {
                        ArrayList<Character> arrayList = new ArrayList<>();
                        for (char ch:("" + i).toCharArray()) {
                            arrayList.add(ch);
                        }
                        for (char ch:("" + j).toCharArray()) {
                            arrayList.remove(new Character(ch));
                        }
                        for (char ch:("" + k).toCharArray()) {
                            arrayList.remove(new Character(ch));
                        }
                        if (arrayList.size()==0)
                            System.out.println(i + " = " + j + " * " + k);
                    }
                }
            }
        }
    }
}
