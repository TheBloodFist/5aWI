package GeometricFigures;

public class Main {
    public static void main(String[] args) {

        Figures s1 = new Squares("Square 1", 10);
        Figures r1 = new Rectangles("Rectangle 1", 20, 30);
        Figures c1 = new Circles("Circle 1", 6);

        s1.calculateArea();
        r1.calculateArea();
        c1.calculateArea();

    }
}
