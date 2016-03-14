package head_7.example7_9;

/**
 * Created by Pasha on 21.02.2016.
 */
class Component1 {
    Component1(String s){
        System.out.println(s);
    }
}
class Component2 {
    Component2(String s){
        System.out.println(s);
    }
}
class Component3 {
    Component3(String s){
        System.out.println(s);
    }
}
class Root {
    Root(String s){
        System.out.println(s);
    }
    Component1 c1 = new Component1("Class Component1");
    Component2 c2 = new Component2("Class Component2");
    Component3 c3 = new Component3("Class Component3");
}

public class StemClass extends Root {
    Component1 c1 = new Component1("Class Component1");
    Component2 c2 = new Component2("Class Component2");
    Component3 c3 = new Component3("Class Component3");
    StemClass(){
        super("Class Root");
        System.out.println("Class Stem");
    }
    public static void main(String[] args) {
        System.out.println("Before call constructor");
        StemClass sc = new StemClass();
        System.out.println("After call constructor");
    }
}
