package test_login;

import base.BasePage;
import loginpage.LoginWithInvalidCredentials;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginWithInvalidCredentials extends BasePage {
    @Test(priority = 3)
    public void testLoginWithInvalidCredentials() {
        LoginWithInvalidCredentials loginPageWithInvalidCredentials = new LoginWithInvalidCredentials();
        String invalidEmail = "ti@gmail.com";
        String invalidPassword = "gdhjskk";
        loginPageWithInvalidCredentials.getLogIn(invalidEmail, invalidPassword);
        Assert.assertTrue(isElementVisible(loginPageWithInvalidCredentials.errorMessageLogin));
    }
}