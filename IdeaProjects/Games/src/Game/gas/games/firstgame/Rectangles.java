package Game.gas.games.firstgame;

import org.newdawn.slick.*;

public class Rectangles {

    private float x;
    private float y;
    public Rectangles() {

    }


    public void update(GameContainer gameContainer, int delta) {
        this.x += (float)delta/20.0;
        this.y += (float)delta/20.0;

        if(this.x>800){
            this.x=0;
            this.y=0;
        }
    }

    public void render(Graphics graphics) {
        graphics.drawRect((float) this.x, (float) this.y, 100, 150);
    }





}
