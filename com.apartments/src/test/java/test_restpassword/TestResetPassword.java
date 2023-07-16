package test_restpassword;

import authenticationpage.SignInPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestResetPassword extends BasePage {



    @Test(priority = 7, groups={"BAT"})
    public void testResetPassword(){


        HomePage homePage = new HomePage();

        homePage.clickOnSignInLink();
        ExcelData excelData = new ExcelData(BasePage.DATA_PATH);
        SignInPage signInPage = new SignInPage();
        String[][] credentials = excelData.readStringArrays("doSignIn");
        String email = credentials[0][0];
        String password = credentials[0][1];

        signInPage.doSignIn(email, password);

    }
}
