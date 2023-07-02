
package testauthentication;


import authontication.DashboardPage;
import authontication.LoginPage;
import base.BasePage;

import homepageBmwUsa.HomePageBmwUsa;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {

    @Test(priority= 1, groups= {"BAT"},dataProvider = "loginDataProvider")

    public void testLogin(String email,String password){
        HomePageBmwUsa homePage = new HomePageBmwUsa();

        LoginPage loginPage=homePage.clickOnLoginLink();
        DashboardPage dashboardPage=loginPage.doSign(email, password);
        Assert.assertTrue(isElementVisible(dashboardPage.myAccountButton));


    }
    @DataProvider(name="loginDataProvider")
    public String[][] loginDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSignIn");
        return data;

    }
}
