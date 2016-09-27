package head_10.example10_16;

/**
 * Created by VitAl on 09.03.2016.
 */
public class InnerClass{
    private static class InClass extends InnerClass{
        @Override
        public void method1(){
            super.method1();
            System.out.println("Inclass method1");
        }
    }
    public static InClass getInClass(){
        return new InClass();
    }
    public void method1(){
        System.out.println("InnerClass method1");
    }

    public static void main(String[] args) {
        InnerClass.InClass ic = InnerClass.getInClass();
        ic.method1();
    }
}
