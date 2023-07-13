package test_accountsettings;

import accountsettingpage.AccountSettingPage;
import authenticationpage.SignInPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import searchpage.ResultSearchPage;
import searchpage.SearchPage;
import utils.ExcelData;

public class TestAccountSettings extends BasePage {

       @Test(priority = 5, groups = {"BAT"})
    public void testAccountSettings() {
        HomePage homePage = new HomePage();
        SignInPage signInPage = new SignInPage();
        AccountSettingPage accountSettingPage= new AccountSettingPage();

        homePage.clickOnSignInLink();
        String email = "tinatebany@gmail.com";
        String password = "Qwerty2023/*-";

        signInPage.doSignIn(email, password);
        homePage.hoverClickOnAccount();
        String phoneNumber = "3174896585";
        String streetAddress = "432 Knights st";
        String city ="Indiana";


        accountSettingPage.doSaveChanges(phoneNumber,streetAddress, city);

    }
    @Test(priority= 6, groups= {"BAT"},dataProvider = "accountSettingsDataProvider")

    public void testDoSaveUpdates(String phoneNumber,String streetAddress,String city){
        HomePage homePage = new HomePage();
        SignInPage signInPage = new SignInPage();
        AccountSettingPage accountSettingPage= new AccountSettingPage();

        homePage.clickOnSignInLink();
        String email = "tinatebany@gmail.com";
        String password = "Qwerty2023/*-";

        signInPage.doSignIn(email, password);
        homePage.hoverClickOnAccount();
        accountSettingPage.doSaveChanges(phoneNumber,streetAddress, city);



    }
    @DataProvider(name="accountSettingsDataProvider")
    public Object[][] accountSettingDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSaveUpdates");
        return data;

    }

}