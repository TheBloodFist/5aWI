package ErstesOO;

public class Car {
    // Instanz / Gedächtnisvariablen

    // don't do that later

    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    public int amountOfHonk;
    private String color;

    //Methode
    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");

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
        int amountOfReceptions;
        for (amountOfReceptions = 0; amountOfReceptions < amountOfHonk; amountOfReceptions++) {
            System.out.print("Tuuut ");
        }
    }


    public void getRemainingRange(){

    }
}

