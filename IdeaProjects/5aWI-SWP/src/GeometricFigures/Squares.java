package GeometricFigures;

public class Squares extends Figures {

    private int length;

    public Squares(String name, int length) {
        super(name);
        this.length = length;
    }

    public void calculateArea() {
        double area = Math.pow(length, 2);
        System.out.println("Squares Area: " + area);
    }



}
