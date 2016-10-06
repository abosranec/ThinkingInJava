package head_12.example12_12;

/**
 * Created by VitAl on 06.10.2016.
 */
class NewException extends Exception{}

public class WorkClass {
    private void h(){
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
        workClass.h();
    }
}
