package ObserverPattern;



public abstract class ASystem implements Observer {

    @Override
    public void inform() {

        if (SunCollector.temp > 18) {
            System.out.println("ASystem: Die Momentane Spannung des SunCollectors beträgt " + SunCollector.temp + "V.");
        }
    }
}
