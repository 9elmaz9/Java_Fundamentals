package Project1;

public class App {
    public static void main(String[] args) {

        ProductSorter productSorter= new ProductSorter();

        ProductFactory productFactory = new ProductFactory(productSorter);

        productFactory.createProducts(100);


    }
}
