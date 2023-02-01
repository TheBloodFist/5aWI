package WintergameFactory;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Oval implements FirstgameActor {

    private float x;
    private float y;

    public Oval() {
        super();

    }

    @Override
    public void update(GameContainer gc, int delta) {
        this.x += (float)delta/20.0;
        this.y += (float)delta/20.0;

        if(this.x>800){
            this.x=0;
            this.y=0;
        }
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval((float) this.x, (float) this.y, 10, 20);

    }


}
