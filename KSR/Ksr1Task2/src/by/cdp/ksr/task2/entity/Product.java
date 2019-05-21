package by.cdp.ksr.task2.entity;

/**
 * Created by Vitali_Markusheusky on 5/20/2019.
 */
public class Product {
    private String productName;
    private double cost;

    public Product(String productName, double cost){
        this.productName = productName;
        this.cost=cost;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.cost, cost) != 0) return false;
        return productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = productName.hashCode();
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
