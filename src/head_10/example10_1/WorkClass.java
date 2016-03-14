package head_10.example10_1;

/**
 * Created by Pasha on 07.03.2016.
 */
//example 1-5
public class WorkClass {
    public static void main(String[] args) {
        Outer outer = new Outer("hello Outer");
        Outer.Inner inner = outer.outInner("hello");
        Outer.Inner inner2 = outer.new Inner("hello2");
        System.out.println(inner);
        System.out.println(inner.returnOuter());
        System.out.println(inner2);
        System.out.println(inner2.returnOuter());
    }
}
