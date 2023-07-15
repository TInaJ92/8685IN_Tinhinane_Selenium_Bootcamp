package test_addtowatchlist;

import base.BasePage;
import futurechartspage.FutureChartPage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAddToWatchList extends BasePage {

    @Test(priority= 1, groups= {"BAT"},dataProvider = "addToWatchListDataProvider")

    public void testAddToWatchList(String email,String password){
        HomePage homePage = new HomePage();
        homePage.doSignIn(email, password);
        Assert.assertTrue(isElementVisible(homePage.userName));
        homePage.clickOnChartsLink();
        FutureChartPage futureChartPage= homePage.clickOnFuturesChart();
        futureChartPage.doAddToWatchList();
        Assert.assertTrue(isElementVisible(futureChartPage.successfullyAddedMessage));

    }
    @DataProvider(name="addToWatchListDataProvider")
    public String[][] loginDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doLogIn");
        return data;

    }
}