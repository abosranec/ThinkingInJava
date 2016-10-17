package head_15.example15_4;

/**
 * Created by Pasha on 18.10.2016.
 */
class Tuple<A, B, C, D>{
    public final A aField;
    public final B bField;
    public final C cField;
    public final D dField;
    public Tuple(A a, B b, C c, D d) {
        this.aField = a;
        this.bField = b;
        this.cField = c;
        this.dField = d;
    }
    @Override
    public String toString() {
        return "Tuple{" +
                "aField=" + aField +
                ", bField=" + bField +
                ", cField=" + cField +
                ", dField=" + dField +
                '}';
    }
}

public class WorkClass {
    public static void main(String[] args) {
        Tuple<String, Integer, Boolean, WorkClass> tuple = new Tuple<>("hello", 41, true, new WorkClass());
        System.out.println(tuple);
    }
}
