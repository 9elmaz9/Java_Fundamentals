import java.util.ArrayList;
import java.util.List;

public class ProductSorter  {

   private List<Product> products = new ArrayList<>();
    private List<FoodProduct> foodProducts = new ArrayList<>();
    private List<HealthProduct>  healthProducts= new ArrayList<>();
    private List<ElectricProduct> electricProducts = new ArrayList<>();


    public List<Product> getProducts() {
        return products;
    }

    public List<FoodProduct> getFoodProducts() {
        return foodProducts;
    }

    public List<HealthProduct> getHealthProducts() {
        return healthProducts;
    }

    public List<ElectricProduct> getElectricProducts() {
        return electricProducts;
    }



    // Methode voor het sorteren en toevoegen van het product aan de overeenkomstige lijsten
    public void sortProduct(Product product){
        if (!products.contains(product) && !productExists(product.getProductId())) {
            products.add(product);

            if (product instanceof FoodProduct) {
                foodProducts.add((FoodProduct) product);
            } else if (product instanceof HealthProduct) {
                healthProducts.add((HealthProduct) product);
            } else if (product instanceof ElectricProduct) {
                electricProducts.add((ElectricProduct) product);
            }
        }
    }

    // om te controleren op de aanwezigheid van een product met hetzelfde ID
    private boolean productExists(int productId) {
        return products.stream().anyMatch(p -> p.getProductId() == productId);
    }
}


