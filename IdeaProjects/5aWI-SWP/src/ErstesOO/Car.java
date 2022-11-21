package ErstesOO;
import java.util.ArrayList;
import java.util.List;

public class Car {
    // Instanz / Gedächtnisvariablen

    // don't do that later (alles public machen)

    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private int amountOfHonk;
    private int amountOfReceptions;
    private String color;
    private List<RearMirror> mirrors;
    private List<Engine> engines;
    private List<Tire> tires;
    private int speed;

    //Konstruktor
    public Car(int fuelConsumption, int fuelAmount, String brand, String serialNumber){
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.mirrors = new ArrayList<>();
        this.engines = new ArrayList<>();
        this.tires = new ArrayList<>();
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public List<Engine> getEngines() {
        return engines;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void addMirror (RearMirror rearMirror){

        this.mirrors.add(rearMirror);
    }

    public void addEngine (Engine engine){

        this.engines.add(engine);
    }

    public void addTire (Tire tire){

        this.tires.add(tire);
    }


    //Methode
    public void brake(){
        System.out.println("Ich bremse");
    }



    public void drive(){
        System.out.println("the motor is running with " + speed);

        if (speed == 100){
            System.out.println("Vollgas (100)");
        }
        if (speed == 1){
            System.out.println("Langsam (1)");
        }

    }

    public void turboBoost(){
        if (fuelAmount*0.1 > (fuelAmount - fuelConsumption)){
            System.out.println("Not enough fuel to go to Superboost");
        }
        else {
            System.out.println("Superboost");
        }
    }

    public void honk() {
        for (amountOfReceptions = 0; amountOfReceptions < amountOfHonk; amountOfReceptions++) {
            System.out.print("Tuuut ");
        }
    }


    public int getFuelAmount() {
        return fuelAmount;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }


    public String getColor() {
        return color;
    }




}

