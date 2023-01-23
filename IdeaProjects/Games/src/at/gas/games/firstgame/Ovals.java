package at.gas.games.firstgame;

import org.newdawn.slick.*;

public class Ovals extends BasicGame {
    private float x;
    private float y;
    public Ovals(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 0;
        this.y = 0;

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        this.x = x++;

        if(this.x>800){
            x--;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect((float) this.x, (float) this.y, 100, 150);

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Ovals("Wintergame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
