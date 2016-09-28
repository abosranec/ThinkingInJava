package head_10.example10_13;

/**
 * Created by VitAl on 09.03.2016.
 */
class WithConstructor{
    WithConstructor(String string){
        System.out.println("Constructor WithConstructor " + string);
    }
    public void method2() {
    }
}
public class WorkClass {
    public WithConstructor method1(final int i){
        return new WithConstructor("hello"){
            private int variable1 = i;
            public void method2(){
                System.out.println("variable = " + i);
            }
        };
    }

    public static void main(String[] args) {
        WithConstructor wc = (new WorkClass()).method1(10);
        wc.method2();
    }
}
