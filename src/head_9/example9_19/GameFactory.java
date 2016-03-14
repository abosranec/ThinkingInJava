package head_9.example9_19;

/**
 * Created by Pasha on 07.03.2016.
 */
public interface GameFactory {
    Game getGame();
}

class CoinFactory implements GameFactory {
    public Game getGame(){
        return new Coin();
    }
}

class BlockFactory implements GameFactory {
    public Game getGame(){
        return new Block();
    }
}

class Factory{
    public static void playGame(GameFactory gameFactory){
        Game g = gameFactory.getGame();
        System.out.println(g.toString() + g.dash());
    }
}
