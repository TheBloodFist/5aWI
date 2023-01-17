package ObserverPattern;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        SunCollector s1 = new SunCollector();

        s1.CurrentVoltage();

        Heizung h1 = new Heizung();
        Geschirrspueler g1 = new Geschirrspueler();
        Laderegler l1 = new Laderegler();

        h1.inform();
        g1.inform();
        l1.inform();

    }
}
