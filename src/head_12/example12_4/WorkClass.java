package head_12.example12_4;

/**
 * Created by Pasha on 06.10.2016.
 */
class NewException extends Exception {
    NewException(){}
    NewException(String str){
        super(str);
    }
}

public class WorkClass {
    void method1() throws NewException{
        System.out.println("Method1 : ");
        throw new NewException();
    }
    void method2(String str) throws NewException{
        System.out.print("Method2 : ");
        throw new NewException(str);
    }
    public static void main(String[] args) {
        WorkClass workClass = new WorkClass();
        try {
            workClass.method1();
        } catch(NewException ex){
            System.out.println("Exception from method1 catch.");
        } finally {
            System.out.println("Finally from try method1.");
        }
        System.out.println();

        try {
            workClass.method2("this is crash...(");
        } catch(NewException ex){
            System.out.println(ex.getMessage());
            System.out.println("Print NewException: " + ex);
            System.out.println("    printStackTrace() : ");
            ex.printStackTrace(System.out);
            System.err.print(ex);
            System.out.println("Exception from method2 catch.");
        }finally {
            System.out.println("Finally from try method2.");
        }
    }
}
