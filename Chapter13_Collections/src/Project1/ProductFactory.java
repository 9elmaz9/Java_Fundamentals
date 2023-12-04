package Project1;

import java.util.Random;

public class ProductFactory {
    ProductSorter productSorter;
    private String[] foodProducts = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private String[] electricProducts = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};

    // een constructor
    public ProductFactory(ProductSorter productSorter) {
        this.productSorter = productSorter;
    }


    //om een bepaald aantal producten aan te maken
    public void createProducts(int amount) {

        for (int i = 0; i < amount; i++) {

            int randomType = new Random().nextInt(3);
            String randomName;

            switch (randomType) {
                case 0:
                    randomName = foodProducts[new Random().nextInt(foodProducts.length)];
                    FoodProduct foodProduct = new FoodProduct(randomName, generateRandomProductId());
                    productSorter.sortProduct(foodProduct);
                    break;

                case 1:
                    randomName = healthProducts[new Random().nextInt(healthProducts.length)];
                    HealthProduct healthProduct = new HealthProduct(randomName, generateRandomProductId());
                    productSorter.sortProduct(healthProduct);
                    break;

                case 2:
                    randomName = electricProducts[new Random().nextInt(electricProducts.length)];
                    ElectricProduct electricProduct = new ElectricProduct(randomName, generateRandomProductId());
                    productSorter.sortProduct(electricProduct);
                    break;
            }
        }

        //  Een lijst met producten weergeven na creatie
        System.out.println("List of created products:");
        for (Product product : productSorter.getProducts()) {
            System.out.println(product);
        }
    }

    //om een willekeurige product-ID te genereren
    private int generateRandomProductId() {
        return new Random().nextInt(151); // Генерирует случайное число от 0 до 150
    }
}
