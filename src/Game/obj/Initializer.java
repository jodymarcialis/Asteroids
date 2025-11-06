package Game.obj;


import Game.AsteroidsGame;
import Game.AsteroidsGame.State;
import Game.Obj;

public class Initializer extends Obj {
    
    private long startTime;
    
    public Initializer(AsteroidsGame game) {
        super(game);
        startTime = System.currentTimeMillis();
    }

    @Override
    public void updateInitializing() {
        if (System.currentTimeMillis() - startTime > 100) {
            game.setState(State.TITLE);
        }
    }
    
}
