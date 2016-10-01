package head_11.example11_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/**
 * Created by Pasha on 02.10.2016.
 */
public class WorkClass {
    public static void replace(ListIterator<Integer> l1, ListIterator<Integer> l2){
//        while (l2.hasNext()) {
//            l2.next();
//        }
        while (l1.hasNext()){
            l2.previous();
            l2.set(l1.next());
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(6,7,8,9,10));
        //replace(arrayList.listIterator(), arrayList2.listIterator());
        replace(arrayList.listIterator(), arrayList2.listIterator(arrayList2.size()));
        System.out.println(arrayList);
        System.out.println(arrayList2);
    }
}
