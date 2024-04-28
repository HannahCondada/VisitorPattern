package VisitorPattern;
import java.util.*;

public class Light implements LightCalc{

    private static final Map<String, Double> LightMap = new HashMap<>();

    static {
        LightMap.put("Mirror", 0.5);
        LightMap.put("Chair", 0.4);
        LightMap.put("Mini Shelf", 0.3);
        LightMap.put("Hoodie Rack", 0.2);
        LightMap.put("Night Stand Lamp", 0.1);
    }

    @Override
    public double totalLightWeight(String furnitureType, double cost) {
        double shipp = LightMap.getOrDefault(furnitureType, 0.0);
        return (shipp * cost) + cost;
    }
}
