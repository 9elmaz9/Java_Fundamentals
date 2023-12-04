package Project1;

public class FoodProduct implements Product{
    private final String name;
    private final int productId;


    public FoodProduct(String name, int productId) {
        this.name = name;
        this.productId = productId;
    }

    @Override
    public String getType() {
        return "FoodProduct";
    }

    @Override
    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "name='" + name + '\'' +
                ", productId=" + productId +
                '}';
    }
}
