package head_10.example10_17;

/**
 * Created by VitAl on 09.03.2016.
 */
public class SuperInnerClass {
    void method1(){
        System.out.println("SuperInnerClass method1()");
    }
    class InnerClass2{
        void method1(){
            System.out.println("SuperInnerClass2 method1()");
        }
        class InnerClass3{
            void method1(){
                System.out.println("SuperInnerClass3 method1()");
            }
        }
    }

    public static void main(String[] args) {
        SuperInnerClass superInnerClass = new SuperInnerClass();
        superInnerClass.method1();
        SuperInnerClass.InnerClass2 ssssuper = superInnerClass.new InnerClass2();
        ssssuper.method1();
        SuperInnerClass.InnerClass2.InnerClass3 ssssuper2 = (superInnerClass.new InnerClass2()).new InnerClass3();
        ssssuper2.method1();
    }
}
