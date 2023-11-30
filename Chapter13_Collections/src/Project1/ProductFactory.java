package Project1;

import java.util.Random;

public class ProductFactory {

    ProductSorter productSorter = new ProductSorter();
    String[] foodProducts = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    String[] electricProducts = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};

    //  public ProductFactory(ProductSorter productSorter) {
    //      this.productSorter = productSorter;
    //  }

    public ProductFactory(ProductSorter productSorter) {
        this.productSorter = productSorter;

    }


    public void createProducts(int amount) throws IllegalAccessException {

        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            //bepaal het type
            int productType = random.nextInt(3);
            //bepaal het naam
            String productName;
            switch (productType) {
                case 0:
                    productName = foodProducts[random.nextInt(foodProducts.length)];
                    break;
                case 1:
                    productName = electricProducts[random.nextInt(electricProducts.length)];
                    break;
                case 2:
                    productName = healthProducts[random.nextInt(healthProducts.length)];
                    break;

                default:
                    throw new IllegalAccessException ("Invalid product type:"+productType);
            }


            //de id product(random 0-150
            int productID =random.nextInt(151);





        }

    }
}
