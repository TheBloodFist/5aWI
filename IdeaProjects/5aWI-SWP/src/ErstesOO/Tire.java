package ErstesOO;

public class Tire {
    private int tireSize;
    private int treadDebt;

    public Tire(int tireSize, int treadDebt) {
        this.tireSize = tireSize;       //example: 16 inches
        this.treadDebt = treadDebt;     //If treadDebt is below 4mm output warning
    }

    public void tireDepth(){
        if (treadDebt < 4){
            System.out.println("Warning: Tire depth low");
        }
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public int getTreadDebt() {
        return treadDebt;
    }

    public void setTreadDebt(int treadDebt) {
        this.treadDebt = treadDebt;
    }
}
