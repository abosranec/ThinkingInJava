package head_15.example15_10;

/**
 * Created by VitAl on 19.10.2016.
 */
public class WorkClass {
    private <A,B> A method1(A a, String str, B b){
        System.out.println(a.getClass().getSimpleName() + " " + str + " " + b.getClass().getSimpleName());
        return a;
    }
    public static void main(String[] args) {
        WorkClass workClass = new WorkClass();
        System.out.println(workClass.method1(1, "hello", 2.1f).getClass().getSimpleName());

        workClass.<Integer, Float>method1(1, "hello", 2.1f);
    }
}
