
package testauthentication;


import authentication.DashboardPage;
import authentication.LoginPage;
import authentication.LoginPageWithInvalidCredentials;
import base.BasePage;

import homepage.HomePage;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {

    @Test(priority = 1, groups = {"BAT"}, dataProvider = "loginDataProvider")

    public void testLogin(String email, String password) {
        HomePage homePage = new HomePage();

        LoginPage loginPage = homePage.clickOnLogInLink();
        DashboardPage dashboardPage = loginPage.doSign(email, password);
        Assert.assertTrue(isElementVisible(dashboardPage.myAccountButton));


    }

    @DataProvider(name = "loginDataProvider")
    public String[][] loginDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSignIn");
        return data;

    }

    @Test(priority = 2, groups = {"BAT"})
    public void testSignIn() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = homePage.clickOnLogInLink();
        String Email = "tinatebany@gmail.com";
        String Password = "Qwerty2023/*-";
        DashboardPage dashboardPage = loginPage.doSign(Email, Password);
        Assert.assertTrue(isElementVisible(dashboardPage.myAccountButton));


    }

    @Test(priority = 3, groups = {"BAT"})
    public void testSignInWithInvalidCredentials() {
        HomePage homePage=new HomePage();
        LoginPage loginPage = homePage.clickOnLogInLink();

        LoginPageWithInvalidCredentials loginPageWithInvalidCredentials = new LoginPageWithInvalidCredentials();
        String invalidEmail = "titi@gmail.com";
        String invalidPassword = "tiroe9";
        loginPageWithInvalidCredentials.doSign(invalidEmail, invalidPassword);
        Assert.assertTrue(isElementVisible(loginPageWithInvalidCredentials.loginButton));
    }
}
