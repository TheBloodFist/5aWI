package Rechner;

public class Main {
    public static void main(String[] args) {
        Double numOne = 144.0;
        Double numTwo = 5.0;
        Rechner.add(numOne, numTwo);
        Rechner.subtract(numOne, numTwo);
        Rechner.multiply(numOne, numTwo);
        Rechner.divide(numOne, numTwo);

        RechnerSinCos.sin(numOne);
        RechnerSinCos.cos(numOne);
        RechnerSinCos.tan(numOne);

        RechnerWurzel.Wurzel(numOne);
    }
}
