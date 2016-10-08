package head_12.example12_21;

/**
 * Created by Pasha on 09.10.2016.
 */
class BasicClass{
    BasicClass(String str) throws Exception{
        System.out.println("BasicClass");
        System.out.println(str.substring(1,3));
        //throw new Exception();
    }
}

public class WorkClass extends BasicClass{
    public WorkClass() throws Exception{
        super(null);
        System.out.println("WorkClass");
    }
    public static void main(String[] args) {
        try {
            WorkClass workClass = new WorkClass();
        }catch(Exception ex){
            System.out.println("Catch basic exception.");
            ex.printStackTrace(System.out);
        }
    }
}
