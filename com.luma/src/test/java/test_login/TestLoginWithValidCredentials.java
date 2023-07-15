package test_login;

import base.BasePage;
import homepage.HomePage;
import loginpage.LoginWithValidCredentials;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;
public class TestLoginWithValidCredentials extends BasePage {
    @Test(priority = 4,dataProvider = "loginDataProvider")
    public void testLogin(String validEmail,String validPassword){
        HomePage homepage=new HomePage();
        LoginWithValidCredentials loginPage=new LoginWithValidCredentials();
        loginPage.getLoginPage(validEmail,validPassword);
        Assert.assertTrue(isElementVisible(loginPage.resultLoginMessage));
    }


    @DataProvider(name = "loginDataProvider")
    public Object[][] loginDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";

        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSignIn");
        return data;
    }
}

