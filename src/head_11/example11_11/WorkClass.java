package head_11.example11_11;

import java.util.*;

/**
 * Created by Pasha on 02.10.2016.
 */
public class WorkClass {
    public static void display(Iterator<String> iterator){
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("h","e","l","l","o"));
        display(list.iterator());
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("h","e","l","l","o"));
        display(list2.iterator());
        HashSet<String> list3 = new HashSet<>(Arrays.asList("h","e","l","l","o"));
        display(list3.iterator());
        TreeSet<String> list4 = new TreeSet<>(Arrays.asList("h","e","l","l","o"));
        display(list4.iterator());
    }
}
