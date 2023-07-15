package test_authentication;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {


    @Test(priority= 1, groups= {"BAT"},dataProvider = "loginDataProvider")

    public void testLogin(String email,String password){
        HomePage homePage = new HomePage();
        homePage.doSignIn(email, password);
        Assert.assertTrue(isElementVisible(homePage.userName));
    }
    @DataProvider(name="loginDataProvider")
    public String[][] loginDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doLogIn");
        return data;

    }

    @Test(priority= 2, groups= {"BAT"},dataProvider = "logoutDataProvider")

    public void testLogout(String email,String password){
        HomePage homePage = new HomePage();
        homePage.doSignIn(email, password);
        homePage.doSignOut();
        Assert.assertTrue(isElementVisible(homePage.loginLink));
    }
    @DataProvider(name="logoutDataProvider")
    public String[][] logoutDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doLogIn");
        return data;

    }

}