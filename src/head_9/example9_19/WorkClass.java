package head_9.example9_19;

/**
 * Created by Pasha on 07.03.2016.
 */
public class WorkClass {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Factory.playGame(new CoinFactory());
        }
        for (int i = 0; i < 10; i++) {
            Factory.playGame(new BlockFactory());
        }
    }
}
