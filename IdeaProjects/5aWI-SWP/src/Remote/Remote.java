package Remote;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Remote {
    private boolean hasPower;
    private String brand;
    private Color color;
    private int remoteSize;
    private List<Battery> batteries;
    private int averageStatus;
    private int decreaseStatus;


    public Remote(boolean hasPower, String brand, Color color, int remoteSize) {
        this.hasPower = hasPower;
        this.brand = brand;
        this.color = color;
        this.remoteSize = remoteSize;   //in cm
        this.batteries = new ArrayList<>();
    }


    public void calculateStatus(int b1, int b2){
        averageStatus = (b1 + b2)/2;
        System.out.println(averageStatus);
    }

    public void turnOn(int b1, int b2){
        System.out.println("Verbraucher ist angeschlossen");
        System.out.println(b1-5);
        System.out.println(b2-5);
    }

    public void turnOff(int b1, int b2){
        System.out.println("Verbraucher ist nicht angeschlossen");
        System.out.println(b1);
        System.out.println(b2);
    }

    public void addBattery (Battery battery){

        this.batteries.add(battery);
    }



    public boolean getHasPower() {
        return hasPower;
    }

    public String getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public int getRemoteSize() {
        return remoteSize;
    }

    public List<Battery> getBattery() {
        return batteries;
    }
}
