package head_12.example12_11;

/**
 * Created by VitAl on 06.10.2016.
 */
class NewException extends Exception{}
class NewException2 extends Exception{}

public class WorkClass {
    private void f() throws NewException2{
        try{
            g();
        } catch(NewException ne){
            NewException2 newException2 = new NewException2();
            newException2.initCause(ne);
            throw newException2;
        }
    }
    private void h() throws NewException2{
        try{
            g();
        } catch(NewException ne){
            throw new RuntimeException(ne);
        }
    }
    private void g() throws NewException{
        throw new NewException();
    }
    public static void main(String[] args) {
        WorkClass workClass = new WorkClass();
        try {
            workClass.f();
        } catch(NewException2 ne2){
            ne2.printStackTrace(System.out);
        }
        try {
            workClass.h();
        } catch(NewException2 ne2){
            ne2.printStackTrace(System.out);
        }
    }
}
