package head_5.example5_8;

/**
 * Created by Pasha on 15.02.2016.
 */
public class UseThis {
    public static void main(String[] args) {
        UseThis2 ut = new UseThis2();
        ut.method1();
    }
}

class UseThis2{
    public void method1 (){
        method2();
        this.method2();
    }
    private void method2 (){
        System.out.println("method 2");
    }
}
