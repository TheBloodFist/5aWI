package Rechner;


public class Rechner {
    //Gegeben ist ein taschenrechner.Rechner, der die Grundrechnungsarten beherrscht.
    //Zusätzlich gibt es
    //	- einen Wissenschaftlichen taschenrechner.Rechner, der auch Sinus und Cosinus kann
    //	- Einen Wurzelrechner, der auch die Wurzel ziehen kann

    public static void add(Double numOne, Double numTwo) {
        Double result = numOne + numTwo;
        System.out.println(numOne + " + " + numTwo + " = " + result);
    }

    public static void subtract(Double numOne, Double numTwo) {
        Double result = numOne - numTwo;
        System.out.println(numOne + " - " + numTwo + " = " + result);
    }

    public static void multiply(Double numOne, Double numTwo) {
        Double result = numOne * numTwo;
        System.out.println(numOne + " * " + numTwo + " = " + result);
    }

    public static void divide(Double numOne, Double numTwo) {
        Double result = numOne / numTwo;
        System.out.println(numOne + " / " + numTwo + " = " + result);
    }
}
