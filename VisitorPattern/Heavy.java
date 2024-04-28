package VisitorPattern;

import java.util.*;
public class Heavy implements HeavyCalc{

    private static final Map<String, Double> HeavyMap = new HashMap<>();

    static {
        HeavyMap.put("Bed", 0.5);
        HeavyMap.put("Table", 0.4);
        HeavyMap.put("Sofa", 0.3);
        HeavyMap.put("Cabinet", 0.2);
        HeavyMap.put("Recliner", 0.1);
    }

    @Override
    public double totalHeavyWeight(String furnitureType, double cost, double distance) {
        double shipp = HeavyMap.getOrDefault(furnitureType, 0.0);
        double shippingFee = distance * 0.8;
        return (shipp * cost) + (shippingFee + cost);
    }
}
