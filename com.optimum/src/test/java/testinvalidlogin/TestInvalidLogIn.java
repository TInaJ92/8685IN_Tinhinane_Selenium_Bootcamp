package testinvalidlogin;

import base.BasePage;
import homepage.HomePage;
import loginpage.LogInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInvalidLogIn extends BasePage {
    @Test
    public void testInvalidLogIn (){
        HomePage homepage = new HomePage();
       homepage.clickOnSignInMobile();
        LogInPage logInPage = new LogInPage();
        String email = "tinatebany@gmail.com";
        String password = "1245kdgdgy";
        logInPage.doSignIn(email,password);
        Assert.assertTrue(isElementVisible(logInPage.errorMessage));
    }
}

