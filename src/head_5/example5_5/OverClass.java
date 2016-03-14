package head_5.example5_5;

/**
 * Created by Pasha on 15.02.2016.
 */
public class OverClass {
    public void bark (String st, int i){
        System.out.println(st + " " + i);
    }
    public void bark (String st){
        System.out.println(st);
    }
    public void bark (int i,String st){
        System.out.println(i + " " + st);
    }
    public static void main(String[] args) {
        OverClass oc = new OverClass();
        oc.bark("hello", 1);
        oc.bark("hello");
        oc.bark(22, "hello");
    }
}
