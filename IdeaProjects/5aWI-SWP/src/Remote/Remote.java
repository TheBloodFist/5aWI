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

    public Remote(boolean hasPower, String brand, Color color, int remoteSize) {
        this.hasPower = hasPower;
        this.brand = brand;
        this.color = color;
        this.remoteSize = remoteSize;   //in cm
        this.batteries = new ArrayList<>();
    }



    public void addBattery (Battery battery){

        this.batteries.add(battery);
    }



    public void getStatus(){

    }


    public boolean isHasPower() {
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
