package GeometricFigures;

public class Rectangles extends Figures{

    private int height;
    private int length;

    public Rectangles(String name, int length, int height) {
        super(name);
        this.height = height;
        this.length = length;
    }

    public void calculateArea() {
        double area = height*length;
        System.out.println("Rectangle Area: " + area);
    }

}
