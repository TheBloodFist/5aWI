package ErstesOO;

public class Main {
    public static void main(String[] args){
        int a =7;

        /*
        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelAmount = 20;
        c1.fuelConsumption = 7;
        c1.serialNumber = "A1234";
        c1.amountOfHonk = 5;

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.fuelAmount = 6;
        c2.fuelConsumption= 5;
        c2.serialNumber = "better";
        c2.amountOfHonk = 5;
         */

        Car c3 = new Car( 17, 20, "opel", "12340", "6 Zylinder");


        System.out.println(c3.getSerialNumber());
        System.out.println(c3.getEngine());
        System.out.println(c3.getFuelAmount());
        c3.drive();

    /*
        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
        c2.brake();
        c2.turboBoost();
        c2.honk();
    */




    }
}