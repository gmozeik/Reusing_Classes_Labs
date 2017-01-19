import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gerrodmozeik on 1/18/17.
 */
public class ProductTest {

    @Test

    public void getSingleProductTotalValueTest() {
        Product gum = new Product(2.0, "gum", 4.0);
        double expected = 8, actual = gum.getSingleProductTotal();
        assertEquals(expected, actual, 0.0);
    }


}