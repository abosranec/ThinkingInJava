package head_9.example9_19;

import java.util.Random;

/**
 * Created by Pasha on 07.03.2016.
 */
public interface Game {
    int dash();
}

class Coin implements Game{
    @Override
    public int dash() {
        Random r = new Random();
        return (r.nextInt(2));
    }
    @Override
    public String toString() {
        return ("Coin value ");
    }
}

class Block implements Game{
    @Override
    public int dash() {
        Random r = new Random();
        return (1 + r.nextInt(6));
    }
    @Override
    public String toString() {
        return ("Block value ");
    }
}