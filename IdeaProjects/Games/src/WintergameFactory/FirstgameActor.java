package WintergameFactory;

import WintergameActors.AbstractActor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public interface FirstgameActor {
    public void update(GameContainer gc, int delta);
    public void render(Graphics graphics);

}
