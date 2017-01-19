import java.util.ArrayList;
import java.util.*;

/**
 * Created by gerrodmozeik on 1/18/17.
 */
public class Inventory {

    static double totalValueOfAllProducts;

    static ArrayList<Product> productsList = new ArrayList<Product>();

    public static void getTotalValueOfAllProducts() {
        for (Product product : productsList) {
            totalValueOfAllProducts += product.getSingleProductTotal();
        }
        System.out.println(totalValueOfAllProducts);
    }

    public static void main(String[] args) {
        Product gum = new Product(1.0, "gum", 10.0);
        Product candy = new Product(2.0, "candy", 15.0);
        productsList.add(gum);
        productsList.add(candy);
        getTotalValueOfAllProducts();
    }

}
