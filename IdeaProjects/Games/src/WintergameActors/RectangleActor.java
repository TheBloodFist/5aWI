package WintergameActors;

import WintergameObserver.Observer;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import wintergame.Maingame.Java.MoveStrategy;

public class RectangleActor extends AbstractActor implements Observer {

    public RectangleActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.drawRect(this.moveStrategy.getX(),this.moveStrategy.getY(),20,20);
        graphics.setColor(Color.white);
    }

    public void inform(){
        this.color = Color.green;
    }
}
