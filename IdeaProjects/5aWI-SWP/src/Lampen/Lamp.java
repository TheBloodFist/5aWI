package Lampen;
import java.util.ArrayList;
import java.util.List;

public class Lamp {

    String name;
    private List<LightElement> lightElements;

    public Lamp(String name, double energyConsumption, boolean status) {
        this.name = name;
        this.lightElements = new ArrayList<>();
    }



    public String getName() {
        return name;
    }

    public List<LightElement> getLightElements() {
        return lightElements;
    }
}
