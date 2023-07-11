package testshoppingcart;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import resultpage.ResultPage;

public class TestShoppingCart extends BasePage {
    @Test(priority = 1, groups = {"BAT"})

    public void testAddToCart() {
        HomePage homepage = new HomePage();
        ResultPage resultPage = new ResultPage();
        String searchTerm="baby shampoo";

        homepage.doSearch(searchTerm);
        resultPage.doAddToCart();
        Assert.assertTrue(isElementVisible(resultPage.goToCheckoutButton));
}

}