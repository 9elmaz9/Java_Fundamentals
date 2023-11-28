package Project1;

public class Product {
      String name;
     final int productId;

    public Product(String name, int productId) {
        this.name = name;
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productId=" + productId +
                '}';
    }
}
