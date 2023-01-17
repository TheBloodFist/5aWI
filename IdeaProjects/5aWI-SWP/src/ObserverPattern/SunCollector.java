package ObserverPattern;

public class SunCollector {


    public int minVoltage = 0;
    public int maxVoltage = 25;
    public int currentVolt = (int) (Math.random() * (maxVoltage - minVoltage));

    public static int temp;


    public void CurrentVoltage(){
        System.out.println("Die Momentane Spannung beträgt " + currentVolt + "V.");
            temp = currentVolt;



    }

}
