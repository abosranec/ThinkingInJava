package head_9.example9_5;

/**
 * Created by VitAl on 02.03.2016.
 */
public class InterfaceClass implements Interface1 {
    @Override
    public void method1() {
        System.out.println("InterfaceClass method1");
    }
    @Override
    public void method2(int i) {
        System.out.println("InterfaceClass method2 i = " + i);
    }
    @Override
    public String method3(int i) {
        return ("InterfaceClass method2 i = " + i);
    }
    public static void main(String[] args) {
        InterfaceClass ic = new InterfaceClass();
        ic.method1();
        ic.method2(10);
        System.out.println(ic.method3(10));
    }
}
