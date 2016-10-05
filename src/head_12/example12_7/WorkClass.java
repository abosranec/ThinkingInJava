package head_12.example12_7;

/**
 * Created by Pasha on 06.10.2016.
 */
class NewException extends Exception {
    NewException(){}
    NewException(String str){
        super(str);
    }
}

class NewException2 extends Exception {
    NewException2(){}
    NewException2(String str){
        super(str);
    }

    @Override
    public String getMessage() {
        return "Change message : " + super.getMessage();
    }
}

public class WorkClass {
    private void method1() throws NewException{
        System.out.println("Method1 : ");
        throw new NewException();
    }
    private void method2(String str) throws NewException2{
        System.out.print("Method2 : ");
        throw new NewException2(str);
    }
    public static void main(String[] args) {
        WorkClass workClass = new WorkClass();
        try {
            workClass.method1();
        } catch(NewException ex){
            System.out.println("Exception from method1 catch.");
            System.out.println(ex);
            System.err.println(ex);
            System.out.println("    printStackTrace() : ");
            ex.printStackTrace(System.out);
        } finally {
            System.out.println("Finally from try method1.");
        }
        System.out.println();

        try {
            workClass.method2("this is crash...(");
        } catch(NewException2 ex){
            System.out.println("Exception2 from method2 catch.");
            System.out.println(ex.getMessage());
            System.out.println(ex);
            System.out.println("    printStackTrace() : ");
            ex.printStackTrace(System.out);
            System.err.println(ex);
        }
    }
}
