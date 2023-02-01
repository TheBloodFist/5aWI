package WintergameActors;

import WintergameObserver.Observer;
import org.lwjgl.Sys;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

import java.util.ArrayList;
import java.util.List;
public class PlayerActor implements Actor{

    private float x, y, speed;
    private List<Observer> observers;

    public PlayerActor(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }


    @Override
    public void render(Graphics graphics) {
        graphics.fillRect(this.x, this.y, 50, 50);
    }

    @Override
    public void update(GameContainer gc, int delta) {
        if (gc.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x -= (float)delta * speed;
        }

        if (gc.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x += delta * speed;
        }

        if (this.x>700){
            for (Observer observer: observers) {
                observer.inform();
            }
        }

    }

}
