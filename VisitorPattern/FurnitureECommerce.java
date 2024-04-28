package VisitorPattern;

//Main Class
public class FurnitureECommerce {

    public static void main(String[] args) {

        LightCalc lightCalc = new Light();
        HeavyCalc heavyCalc = new Heavy();

        Furniture Bed = new Furniture("Bed", 13990,20);
        Furniture Table = new Furniture("Table", 6990,10);
        Furniture Sofa = new Furniture("Sofa", 8990,25);
        Furniture Cabinet = new Furniture("Cabinet", 9490, 15);
        Furniture HoodieRack = new Furniture("Hoodie Rack", 1290, 34);

        // Calculate total cost using LightCalc for furnitures
        System.out.println("The " + Bed.getFurnitureType() + " costs PHP " + Bed.accept(lightCalc, Bed.getPrice()) + " including the shipping fee");
        System.out.println("The " + Table.getFurnitureType() + " costs PHP " + Table.accept(lightCalc, Table.getPrice()) + " including the shipping fee");
        System.out.println("The " + Sofa.getFurnitureType() + " costs PHP " + Sofa.accept(lightCalc, Sofa.getPrice()) + " including the shipping fee");
        System.out.println("The " + Cabinet.getFurnitureType() + " costs PHP " + Cabinet.accept(lightCalc, Cabinet.getPrice()) + " including the shipping fee");
        System.out.println("The " + HoodieRack.getFurnitureType() + " costs PHP " + HoodieRack.accept(lightCalc, HoodieRack.getPrice()) + " including the shipping fee");



    }
}
