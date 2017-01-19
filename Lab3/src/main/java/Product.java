import java.util.ArrayList;

/**
 * Created by gerrodmozeik on 1/18/17.
 */
public class Product {

    double price;
    String productID;
    double amountOnHand;

    public static void main(String[] args) {

        }


    Product(double price, String productID, double amountOnHand) {
        this.price = price;
        this.productID = productID;
        this.amountOnHand = amountOnHand;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmountOnHand(double amountOnHand) {
        this.amountOnHand = amountOnHand;
    }

    public double getPrice() {
        return price;
    }

    public String getProductID() {
        return productID;
    }

    public double getAmountOnHand() {
        return amountOnHand;
    }

    public double getSingleProductTotal() {
        double totalValue = price * amountOnHand;
        return totalValue;
    }

}
