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
        Furniture Recliner = new Furniture("Recliner", 9490, 15);

        Furniture Mirror = new Furniture("Mirror", 1290, 34);
        Furniture Chair = new Furniture("Chair", 1290, 34);
        Furniture MiniShelf = new Furniture("Mini Shelf", 1290, 34);
        Furniture HoodieRack = new Furniture("Hoodie Rack", 1290, 34);
        Furniture NighStandLamp = new Furniture("Night Stand Lamp", 1290, 34);


        // Calculate total cost using LightCalc for furnitures
        System.out.println("Heavy Weight Furnitures:");
        System.out.println("The " + Bed.getFurnitureType() + " costs PHP " +  Bed.accept(heavyCalc, Bed.getPrice(), Bed.getDistance()) + " including the shipping fee");
        System.out.println("The " + Table.getFurnitureType() + " costs PHP " +  Table.accept(heavyCalc, Table.getPrice(), Table.getDistance()) + " including the shipping fee");
        System.out.println("The " + Sofa.getFurnitureType() + " costs PHP " +  Sofa.accept(heavyCalc, Sofa.getPrice(), Sofa.getDistance()) + " including the shipping fee");
        System.out.println("The " + Cabinet.getFurnitureType() + " costs PHP " +  Cabinet.accept(heavyCalc, Cabinet.getPrice(), Cabinet.getDistance()) + " including the shipping fee");
        System.out.println("The " + Recliner.getFurnitureType() + " costs PHP " +  Recliner.accept(heavyCalc, Recliner.getPrice(), Recliner.getDistance()) + " including the shipping fee");

        System.out.println("\n");
        System.out.println("Light Weight Furnitures:");

        System.out.println("The " + Mirror.getFurnitureType() + " costs PHP " + Mirror.accept(lightCalc, Mirror.getPrice()) + " including the shipping fee");
        System.out.println("The " + Chair.getFurnitureType() + " costs PHP " + Chair.accept(lightCalc, Chair.getPrice()) + " including the shipping fee");
        System.out.println("The " + MiniShelf.getFurnitureType() + " costs PHP " + MiniShelf.accept(lightCalc, MiniShelf.getPrice()) + " including the shipping fee");
        System.out.println("The " + HoodieRack.getFurnitureType() + " costs PHP " + HoodieRack.accept(lightCalc, HoodieRack.getPrice()) + " including the shipping fee");
        System.out.println("The " + NighStandLamp.getFurnitureType() + " costs PHP " + NighStandLamp.accept(lightCalc, NighStandLamp.getPrice()) + " including the shipping fee");
    }
}
