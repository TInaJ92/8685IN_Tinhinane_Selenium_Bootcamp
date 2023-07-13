package testinvalidlogin;

import base.BasePage;
import homepage.HomePage;
import loginpage.LogInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInvalidLogIn extends BasePage {
    @Test
    public void testInvalidLogIn (){
        try {
            HomePage page = new HomePage();
            page.clickOnSignInMobile();
            LogInPage logInPage = new LogInPage();
            String email = "tinatebany@gmail.com";
            String password = "1245kdgdgy";
            logInPage.doSignIn(email, password);
            Assert.assertTrue(isElementVisible(logInPage.errorMessage));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

