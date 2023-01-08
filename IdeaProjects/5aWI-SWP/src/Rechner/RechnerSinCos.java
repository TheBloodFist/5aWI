package Rechner;

public class RechnerSinCos extends Rechner {
    public static void sin(Double numOne) {
        double result = Math.sin(numOne);
        System.out.println("sin(" + numOne + ") = " + result);
    }
    public static void cos(Double numOne) {
        double result = Math.cos(numOne);
        System.out.println("cos(" + numOne + ") = " + result);
    }
    public static void tan(Double numOne) {
        double result = Math.tan(numOne);
        System.out.println("tan(" + numOne + ") = " + result);
    }
}
