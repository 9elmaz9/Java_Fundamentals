package Project1;

public class App {
    public static void main(String[] args) {

        //een exemplaar van ProductSorter
        ProductSorter productSorter= new ProductSorter();

        // een exemplaar van ProductFactory met de ProductSorter
        ProductFactory productFactory = new ProductFactory(productSorter);

        //Maak 100 producten
        productFactory.createProducts(100);

        System.out.println("\n");
        System.out.print("Total quantity of all products :" +productSorter.getProducts().size());
        System.out.println();
        System.out.print("Number of HealthProducts :" +productSorter.getHealthProducts().size());
        System.out.println();
        System.out.print("Number of FoodProducts :" +productSorter.getFoodProducts().size());
        System.out.println();
        System.out.print("Number of ElectricProducts :" +productSorter.getElectricProducts().size());



    }
}
