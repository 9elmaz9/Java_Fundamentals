package Project1;

public class HealthProduct  implements Product{
    private final String name;
    private final int productId;


    public HealthProduct(String name, int productId) {
        this.name = name;
        this.productId = productId;
    }

    @Override
    public String getType() {
        return "HealthProduct";
    }

    @Override
    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return "HealthProduct{" +
                "name='" + name + '\'' +
                ", productId=" + productId +
                '}';
    }
    }
