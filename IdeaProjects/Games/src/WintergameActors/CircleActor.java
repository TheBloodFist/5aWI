package WintergameActors;

import WintergameActors.Actor;
import WintergameObserver.Observer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import wintergame.Maingame.Java.MoveRight;
import wintergame.Maingame.Java.MoveStrategy;

import java.awt.*;
import org.newdawn.slick.Color;

public class CircleActor extends AbstractActor implements Observer {


    public CircleActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }


    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.drawOval(this.moveStrategy.getX(),this.moveStrategy.getY(),20,20);
        graphics.setColor(Color.white);
    }

    public void inform(){
        this.color = Color.orange;
    }
}
