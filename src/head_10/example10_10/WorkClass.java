package head_10.example10_10;

/**
 * Created by VitAl on 09.03.2016.
 */
interface Inter1{
    void method1();
}

class RealizeInter{
    public Inter1 method2() {
        return new Inter1() {
            @Override
            public void method1() {
                System.out.println("Derivative Inter1");
            }
        };
    }
}

public class WorkClass {
    public static void main(String[] args) {
        Inter1 ir = (new RealizeInter()).method2();
        ir.method1();
    }
}
