public class Car {
    // Instanz / Gedächtnisvariablen

    // dont do that later

    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
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
}
