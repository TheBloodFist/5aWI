package WintergameActors;

import WintergameFactory.FirstgameActor;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import wintergame.Maingame.Java.MoveStrategy;

public abstract class AbstractActor implements Actor {
    protected MoveStrategy moveStrategy;
    protected Color color;


    public AbstractActor(MoveStrategy moveStrategy) {
        super();
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        moveStrategy.update(delta);
    }


}
