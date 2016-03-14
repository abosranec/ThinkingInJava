package head_5.example5_9;

/**
 * Created by Pasha on 15.02.2016.
 */
public class ThisConstr {
    String s;
    ThisConstr(){
        this("hello");
        System.out.println("no arguments");
    }
    ThisConstr(String s){
        this.s = s;
        System.out.println(s);
    }
    public static void main(String[] args) {
        ThisConstr tc = new ThisConstr();
    }
}
