package Rechner;

public class RechnerWurzel extends Rechner {
    public static void Wurzel(Double numOne) {
        double result = Math.sqrt(numOne);
        System.out.println("√" + numOne + " = " + result);
    }
}
