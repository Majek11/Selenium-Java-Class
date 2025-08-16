package part2.com.saucedemo.tests.products;

import com.saucedemo.pages.ProductsPage;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

import static org.junit.jupiter.api.Assertions.*;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.logIntoTheApplication("standard_user", "secret_sauce");
            assertTrue(productsPage.isHeaderDisplayed(),
                "\n Product Header Is Not Displayed \n");
    }

}
