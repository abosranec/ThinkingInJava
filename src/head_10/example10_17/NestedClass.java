package head_10.example10_17;

/**
 * Created by VitAl on 09.03.2016.
 */
public class NestedClass {
    static void method1(){
        System.out.println("SuperInnerClass method1()");
    }
    static class InnerClass2 extends NestedClass{
        static void method1(){
            System.out.println("SuperInnerClass2 method1()");
        }
        static class InnerClass3 extends InnerClass2{
            static void method1(){
                System.out.println("SuperInnerClass3 method1()");
            }
        }
    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        nestedClass.method1();
        NestedClass.InnerClass2 innerClass2 = new NestedClass.InnerClass2();
        innerClass2.method1();
        NestedClass.InnerClass2.InnerClass3 innerClass3 = new NestedClass.InnerClass2.InnerClass3();
        innerClass3.method1();

        NestedClass nestedClass2 = new NestedClass();
        nestedClass2.method1();
        NestedClass innerClass22 = new NestedClass.InnerClass2();
        innerClass22.method1();
        NestedClass innerClass33 = new NestedClass.InnerClass2.InnerClass3();
        innerClass33.method1();
    }
}
