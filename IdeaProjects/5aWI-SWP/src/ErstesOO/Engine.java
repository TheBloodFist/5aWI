package ErstesOO;

public class Engine {
    public enum TYPE {DIESEL, PETROL};
    private int horsepower;
    private TYPE type; // Diesel oder Benzin


    public Engine(int horsepower, TYPE type) {
        this.horsepower = horsepower;
        this.type = type;
    }



    public int getHorsepower() {
        return horsepower;
    }

    public TYPE getType() {
        return type;
    }
}


