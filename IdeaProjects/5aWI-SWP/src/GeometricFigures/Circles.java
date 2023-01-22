package GeometricFigures;

public class Circles extends Figures{

    private int radius;

    public Circles(String name, int radius) {
        super(name);
        this.radius = radius;
    }


    public void calculateArea() {
        double area = (Math.pow(radius, 2))*Math.PI;
        System.out.println("Circles Area " + area);
    }
}
