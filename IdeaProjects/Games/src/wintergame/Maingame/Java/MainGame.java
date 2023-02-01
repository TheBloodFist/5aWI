package wintergame.Maingame.Java;


import Singleton.CounterSingleton;
import WintergameActors.Actor;
import WintergameActors.CircleActor;
import WintergameActors.PlayerActor;
import WintergameActors.RectangleActor;
import WintergameFactory.RandomActorFactory;
import org.lwjgl.Sys;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {

    private List<Actor> actors;
    private PlayerActor player;

    public MainGame(String title){
        super(title);

    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        this.actors = new ArrayList<>();
        this.player = new PlayerActor(200,200,0.5f);

        MoveStrategy ms1 = new MoveRight(10,20,0.3f);
        MoveStrategy ms2 = new MoveLeft(900,100,0.1f);
        MoveStrategy ms3 = new MoveLeft(500,200,0.1f);

        this.actors.add(player);
        //this.actors.add(new CircleActor(ms1)); //Alter Code -> sollte c1 sein
        CircleActor c1 = new CircleActor(ms1);
        CircleActor c2 = new CircleActor(ms2);
        RectangleActor r1 = new RectangleActor(ms3);


        this.actors.add(c1);
        this.actors.add(c2);
        this.actors.add(r1);

        this.player.addObserver(c1);
        this.player.addObserver(c2);
        this.player.addObserver(r1);

/*
        for (int i = 0; i < 10; i++) {
            this.actors.add(RandomActorFactory.getRandomActor());
        }
*/

        CounterSingleton cs1 = CounterSingleton.getInstance();
        CounterSingleton cs2 = CounterSingleton.getInstance();

        cs1.increaseCounter();
        cs2.increaseCounter();

        System.out.println(cs1.getCounter());
        System.out.println(cs2.getCounter());


    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for (Actor actor: this.actors) {
            actor.update(gc, delta);
        }
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        for (Actor actor: this.actors) {
            actor.render(graphics);
        }

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Wintergame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
