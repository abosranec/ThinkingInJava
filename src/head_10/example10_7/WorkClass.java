package head_10.example10_7;

/**
 * Created by Pasha on 08.03.2016.
 */
class Outer{
    public Outer(String str) {
        this.str = str;
    }

    private String str;

    private void method1(String str){
        System.out.println("Outer method1, strOut = " + str + " ,strIn = " + this.str);
    }

    class Inner {
        void outerCall(String str){
            Outer.this.str = str;
            method1(str);
        }
    }

    public String getStr() {
        return str;
    }

    public void method2(String str){
        (new Inner()).outerCall(str);
    }
}

public class WorkClass {
    public static void main(String[] args) {
        Outer out = new Outer("init str");
        System.out.println(out.getStr());
        out.method2("Call method 2 Outer");
    }
}
