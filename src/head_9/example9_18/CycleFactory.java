package head_9.example9_18;

/**
 * Created by Pasha on 07.03.2016.
 */
interface CycleFactorySuper{
    Cycle getCycle();
}

class UnicycleFactory implements CycleFactorySuper {
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class BicycleFactory implements CycleFactorySuper{
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactorySuper{
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class CycleFactory {
    public static void drowCycle(CycleFactorySuper cycle){
        Cycle cl = cycle.getCycle();
        cl.drow();
    }
}
