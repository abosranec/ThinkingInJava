package head_9.example9_18;

/**
 * Created by Pasha on 07.03.2016.
 */
public interface Cycle {
    void drow();
}

class Unicycle implements Cycle {
    @Override
    public void drow() {
        System.out.println("Unicycle drow");
    }
}

class Bicycle implements Cycle {
    @Override
    public void drow() {
        System.out.println("Bicycle drow");
    }
}

class Tricycle implements Cycle {
    @Override
    public void drow() {
        System.out.println("Tricycle drow");
    }
}

