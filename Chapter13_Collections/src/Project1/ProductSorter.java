package Project1;

import java.util.ArrayList;
import java.util.List;

public class ProductSorter {



    List<Product> products = new ArrayList<>();
    List<FoodProduct> foodProducts = new ArrayList<>();
    List<HealthProduct>  healthProducts= new ArrayList<>();
    List<ElectricProduct> electricProducts = new ArrayList<>();


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

    public List<Product> sortProduct(Product product){
        return products;
    }

}
