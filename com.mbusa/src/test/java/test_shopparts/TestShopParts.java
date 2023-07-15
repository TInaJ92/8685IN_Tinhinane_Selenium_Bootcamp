package test_shopparts;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import shoppingpage.ShopPartsPage;

public class TestShopParts extends BasePage {



    @Test(priority = 3,groups={"BAT"})
    public void testDoShopParts(){
        HomePage homePage=new HomePage();
        ShopPartsPage shopPartsPage=homePage.clickOnShoppingLink();
        shopPartsPage.doShopParts();
        Assert.assertTrue(isElementVisible(shopPartsPage.descriptiveText));

    }
}