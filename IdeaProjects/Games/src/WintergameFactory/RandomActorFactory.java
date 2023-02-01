package WintergameFactory;


import java.util.Random;

public class RandomActorFactory {

    public static FirstgameActor getRandomActor(){
        Random random = new Random();
        int number = random.nextInt(3);

        if (number == 0){
            return new Oval();
        }
        if(number == 1){
            return new Oval();
        }
        return new Oval();
    }
}
