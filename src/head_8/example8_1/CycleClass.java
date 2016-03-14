package head_8.example8_1;

import java.util.Random;

/**
 * Created by Pasha on 28.02.2016.
 */
class Cycle{
    public void print(){
        System.out.println("Class Cycle " + count());
    }
    protected int count(){
        return 1;
    }
}
class Unicycle extends Cycle{
    @Override
    public void print(){
        System.out.println("Class Unicycle " + super.count() + count());
    }
    @Override
    protected int count() {
        return 2;
    }
}
class Bicycle extends Cycle{
    @Override
    public void print(){
        System.out.println("Class Bicycle " + super.count() + count());
    }
    @Override
    protected int count() {
        return 3;
    }
}
class Tricycle extends Cycle{
    @Override
    public void print(){
        System.out.println("Class Tricycle " + super.count() + count());
    }
    @Override
    protected int count() {
        return 4;
    }
}

public class CycleClass {
    static Random rm = new Random();
    public static Cycle randomGenerator(){
        switch(rm.nextInt(3)){
            default:
            case 0: return new Unicycle();
            case 1: return new Bicycle();
            case 2: return new Tricycle();
        }
    }
    public static void main(String[] args) {
        Cycle[] c = new Cycle[4];
        c[0] = new Cycle();
        c[0].print();
        for (int i = 1; i < 4; i++) {
            c[i] = randomGenerator();
            c[i].print();
        }
    }
}
