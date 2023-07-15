package test_authentication;

import authenticationpage.SignInPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {


    @Test(priority = 0, groups = "BAT")

    public void testDoSignIn() {

        HomePage homePage = new HomePage();

        homePage.clickOnSignInLink();
        ExcelData excelData = new ExcelData(BasePage.DATA_PATH);
        SignInPage signInPage = new SignInPage();
        String[][] credentials = excelData.readStringArrays("doSignIn");
        String email = credentials[0][0];
        String password = credentials[0][1];

        signInPage.doSignIn(email, password);


        Assert.assertTrue(checkElementPresent(homePage.userName));
    }


    @Test(priority= 1, groups= {"BAT"},dataProvider = "signInDataProvider")
    public void testUserSignIn(String email,String password){
        SignInPage signInPage = new SignInPage();
        HomePage homePage = new HomePage();
        homePage.clickOnSignInLink();

        signInPage.doSignIn(email,password);
        Assert.assertTrue(checkElementPresent(homePage.loggedInUsername));
    }

    @DataProvider(name="signInDataProvider")
    public Object[][] testSignInUserDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSignIn");
        return data;

    }


    @Test(priority = 2, groups={"BAT"}, dataProvider = "signOutDataProvider")

    public void testLogOut(String email,String pass){
        HomePage homePage= new HomePage();
        SignInPage signInPage = new SignInPage();


        homePage.clickOnSignInLink();


        signInPage.doSignIn(email,pass);
        homePage.doSignOut();

        Assert.assertTrue(isElementVisible(homePage.signInLink));
    }
    @DataProvider(name="signOutDataProvider")
    public Object[][] testSignOutDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSignIn");
        return data;

    }

}










