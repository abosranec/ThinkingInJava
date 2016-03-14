package head_9.example9_18;

/**
 * Created by Pasha on 07.03.2016.
 */
public class WorkClass {
    public static void main(String[] args) {
        CycleFactory.drowCycle(new UnicycleFactory());
        CycleFactory.drowCycle(new BicycleFactory());
        CycleFactory.drowCycle(new TricycleFactory());
    }
}
