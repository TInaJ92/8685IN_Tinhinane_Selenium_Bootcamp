package testdynamictable;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDynamicTables extends BasePage {

    @Test(priority = 1, groups = {"Smoke"})
    public void testIndicesTableIsPresent(){
        HomePage homePage = new HomePage();
        Assert.assertTrue(isElementVisible(homePage.indicesTable));
    }
    @Test
    public void testCommoditiesTab(){
        HomePage homePage = new HomePage();
        homePage.clickOnCommoditiesTab();
        Assert.assertTrue(isElementVisible(homePage.commoditiesTable));

    }
    @Test
    public void testBondsTab(){
        HomePage homePage = new HomePage();
        homePage.clickOnBondsTab();
        Assert.assertTrue(isElementVisible(homePage.bondsTable));

    }
    @Test
    public void testStocksTab(){
        HomePage homePage = new HomePage();
        homePage.clickOnStocksTab();
        Assert.assertTrue(isElementVisible(homePage.stocksTable));
    }
}