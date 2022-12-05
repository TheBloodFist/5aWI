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


        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, -40);
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        Tire t1 = new Tire(16, 4);
        Tire t2 = new Tire(16, 4);
        Tire t3 = new Tire(16, 4);
        Tire t4 = new Tire(16, 2);

        Car c3 = new Car( 17, 20, "opel", "12340");
        c3.addMirror(r1);
        c3.addMirror(r2);
        c3.addEngine(e1);
        c3.addTire(t1);
        c3.addTire(t2);
        c3.addTire(t3);
        c3.addTire(t4);


        System.out.println(c3.getSerialNumber());
        System.out.println(c3.getFuelAmount());

        System.out.println(c3.getMirrors().get(0).getPosition());
        System.out.println(c3.getEngines().get(0).getHorsepower());
        c3.drive();
        t4.tireDepth();

    /*
        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
        c2.brake();
        c2.turboBoost();
        c2.honk();
    */
        c3.honk();




    }
}