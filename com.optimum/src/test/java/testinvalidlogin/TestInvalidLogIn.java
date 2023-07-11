package testinvalidlogin;

import base.BasePage;
import homepage.HomePage;
import loginpage.LogInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInvalidLogIn extends BasePage {
    @Test (priority = 2 , groups = {"BAT"} )
    public void testInvalidLogIn (){
        HomePage homePage = new HomePage();
        homePage.clickOnSignInMobile();
        LogInPage logInPage = new LogInPage();
        String email = "tinatebany@gmail.com";
        String password = "1245kdgdgy";
        logInPage.doSignIn(email,password);
        Assert.assertTrue(isElementVisible(logInPage.errorMessage));
    }
}

