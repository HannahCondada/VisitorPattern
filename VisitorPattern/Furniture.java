package VisitorPattern;

public class Furniture implements TotalShippingCalc {
    private String FurnitureType;
    private double Price;
    private double Distance;

    public Furniture (String furnitureType, double price, double distance) {
        this.FurnitureType = furnitureType;
        this.Price = price;
        this.Distance = distance;
    }

    @Override
    public double accept(LightCalc lightCalc, double cost) {
        return lightCalc.totalLightWeight(this.FurnitureType, cost);
    }

    @Override
    public double accept(HeavyCalc heavyCalc, double cost, double distance) {
        return heavyCalc.totalHeavyWeight(this.FurnitureType, cost, distance);
    }

    //GETTERS
    public String getFurnitureType() {
        return FurnitureType;
    }

    public double getPrice(){
        return Price;
    }

    public double getDistance() {
        return Distance;
    }

    //SETTERS


    public void setFurnitureType(String furnitureType) {
        this.FurnitureType = furnitureType;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public void setDistance(double distance) {
        this.Distance = distance;
    }


}
