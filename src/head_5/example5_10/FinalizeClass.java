package head_5.example5_10;

/**
 * Created by Pasha on 19.02.2016.
 */
public class FinalizeClass {
    public static void main(String[] args) {
        FinalizeClass fc = new FinalizeClass();
        fc = null;
        //System.gc();
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 270; j++) {
                if (j%10 == 0)
                    new FinalizeClass().led = true;
                else
                    new FinalizeClass();
            }
        }
        System.out.println("All call good: " + count);
        System.out.println("All call no good: " + count);
    }
    static long count;
    static long countTrue;
    static {
        count = 0;
        countTrue = 0;
    }
    boolean led;
    {
        led = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (led == true) {
            countTrue++;
            System.out.println("No good... " + countTrue);
        }
        else {
            count++;
            System.out.println("Goodbye...( " + count);
        }
        super.finalize();
    }
}
