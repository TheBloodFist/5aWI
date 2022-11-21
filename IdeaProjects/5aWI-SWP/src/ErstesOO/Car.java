package ErstesOO;

public class Car {
    // Instanz / Gedächtnisvariablen

    // don't do that later

    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private int amountOfHonk;
    private int amountOfReceptions;
    private String color;
    private int speed = 100;
    private String engine;

    //Konstruktor
    public Car(int fuelConsumption, int fuelAmount, String brand, String serialNumber, String engine){
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.engine = engine;
    }


    //Methode
    public void drive(){
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving");

        if (speed == 100){
            System.out.println("Vollgas (100)");
        }
        if (speed == 1){
            System.out.println("Langsam (1)");
        }

    }

    public void brake(){
        System.out.println("Ich bremse");
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

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getEngine() {
        return engine;
    }
}

