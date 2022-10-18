package ErstesOO;

public class Main {
    public static void main(String[] args){
        int a =7;

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelAmount = 20;
        c1.getFuelConsumption(7);
        c1.serialNumber = "A1234";

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.fuelAmount = 6;
        c2.getFuelConsumption(5);
        c2.serialNumber = "better";

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
        c2.brake();
        c2.turboBoost();





    }
}