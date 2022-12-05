package Remote;

public class Battery {
    private int chargingStatus;
    private String batteryType;

    public Battery(int chargingStatus, String batteryType) {
        this.chargingStatus = chargingStatus;
        this.batteryType = batteryType;
    }


    public int getChargingStatus() {
        return chargingStatus;
    }

    public void setChargingStatus(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }



    public String getBatteryType() {
        return batteryType;
    }
}
