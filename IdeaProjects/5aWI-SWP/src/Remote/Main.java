package Remote;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        Remote r1 = new Remote(true,"Samsung", Color.red, 148);

        Battery b1 = new Battery(100, "AAA");
        Battery b2 = new Battery(60, "AAA");

        r1.addBattery(b1);
        r1.addBattery(b2);

        System.out.println(r1.getBattery().get(0).getChargingStatus());

    }
}
