package Project1;

public class ProductFactory {

    ProductSorter productSorter;
    String[] foodProducts ={"Apple","Steak","Potatoes","Salad","Pear"};
    String[] healthProducts={"Face cream","Vitamins","Eye drops","Toothpaste","Shampoo"};
    String[] electricProducts={"Hair dryer","Vacuum","Mixer","Washing machine","Dishwasher"};

    public ProductFactory(ProductSorter productSorter) {
        this.productSorter = productSorter;
    }

    public void createProduct(int amount){

    }
}
