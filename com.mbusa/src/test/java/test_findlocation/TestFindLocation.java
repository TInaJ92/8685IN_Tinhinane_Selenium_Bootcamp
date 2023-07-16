package test_findlocation;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import searchpage.SearchPage;
import utils.ExcelData;

public class TestFindLocation extends BasePage {

    @Test(priority=5,groups={"BAT"},dataProvider = "findDealerLocationDataProvider")
    public void testFindDealer(String zipCode){
        HomePage homePage=new HomePage();
        SearchPage searchPage= homePage.doFindDealer(zipCode);
        searchPage.clickOnCollisionCenter();
        Assert.assertTrue(isElementVisible(searchPage.collisionCenterResult));
    }
    @DataProvider(name = "findDealerLocationDataProvider")
    public String[][] findDealerDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doFindDealer");
        return data;

    }

}