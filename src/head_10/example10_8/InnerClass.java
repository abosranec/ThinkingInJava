package head_10.example10_8;

/**
 * Created by Pasha on 08.03.2016.
 */
interface Inner{
    void method1();
}

public class InnerClass {
    public Inner method2(){
        class InnerInterface implements Inner{
            @Override
            public void method1() {
                System.out.println("InnerInterface method1");
            }
        }
        return new InnerInterface();
    }

    public static void main(String[] args) {
        InnerClass ic = new InnerClass();
        Inner inner = ic.method2();
        inner.method1();
    }
}
