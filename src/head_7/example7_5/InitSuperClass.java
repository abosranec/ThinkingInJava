package head_7.example7_5;

/**
 * Created by Pasha on 21.02.2016.
 */
class AClass{
    AClass(String s){
        System.out.println(s);
    }
}
class BClass extends AClass{
    BClass(String s){
        super("Class A");
        System.out.println(s);
    }
}
public class InitSuperClass extends BClass {
    public InitSuperClass(){
        super("Class B");
        System.out.println("Class InitSuperClass");
    }
    public static void main(String[] args) {
        System.out.println("Before call constructor");
        InitSuperClass isc = new InitSuperClass();
        System.out.println("After call constructor");
    }
    AClass ac = new AClass("Field");
}
