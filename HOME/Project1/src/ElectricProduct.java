public class ElectricProduct implements   Product{

    private final String name;
    private final int productId;


    public ElectricProduct(String name, int productId) {
        this.name = name;
        this.productId = productId;
    }

    @Override
    public String getType() {
        return "ElectricProduct";
    }

    @Override
    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return "ElectricProduct{" +
                "name='" + name  +
                ", productId=" + productId +
                '}';
    }
}
