package test_shoppingcart;

import authentication.DashboardPage;
import authentication.LoginPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import searchpage.ModelSelectedPage;
import shoppingpage.ShoppingPage;

public class TestShoppingCart extends BasePage {
    @Test(priority = 1, groups = {"BAT"})

    public void testShoppingCart() {

        HomePage homePage = new HomePage();
        LoginPage loginPage = homePage.clickOnLoginLink();
        String email = "tinatebany@gmail.com";
        String password = "Qwerty2023/*-";
        DashboardPage dashboardPage = loginPage.doSign(email, password);

        ShoppingPage shoppingPage = dashboardPage.switchToNewTab();
        shoppingPage.doShop();

        Assert.assertTrue(isElementVisible(shoppingPage.descriptiveAccessory));
    }
}