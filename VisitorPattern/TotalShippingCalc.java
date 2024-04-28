package VisitorPattern;

public interface TotalShippingCalc {
    public double accept(LightCalc lightCalc, double cost);

    public double accept(HeavyCalc heavyCalc, double cost, double distance);
}
