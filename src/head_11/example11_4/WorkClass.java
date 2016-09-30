package head_11.example11_4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by VitAl on 30.09.2016.
 */
public class WorkClass {
    private int index = 0;
    private ArrayList<String> animals= new ArrayList<String>(Arrays.asList(
            "cat", "dog", "wolf", "pig", "horse", "elephant", "mouse", "fish", "spider", "shark", "hamster"));
    public String next(){
        if (animals.size() > index)
            return animals.get(index++);
        else {
            index=0;
            return animals.get(index++);
        }
    }
    public static void main(String[] args) {
        WorkClass workClass = new WorkClass();
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(workClass.next());
        }
        System.out.println(arrayList);
    }
}
