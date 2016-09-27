package head_9.example9_1;

/**
 * example9.1-3
 */
abstract class Basic{
    @Override
    public String toString() {
        return "Basic{}";
    }
}

public class AbstractClass extends Basic{
    public static void print(Basic basic) {
        ((AbstractClass)basic).method1();
        System.out.println("print Abstract value = " + basic);
    }
    void method1(){
        System.out.println("method1");
    }
    public static void main(String[] args) {
        AbstractClass ac = new AbstractClass();
        AbstractClass.print(new AbstractClass());
    }
    @Override
    public String toString() {
        return "AbstractClass{}";
    }
}