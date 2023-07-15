package test_registration;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import registrationpage.RegistrationPage;
import utils.ExcelData;
import utils.GenerateData;

public class TestRegistration extends BasePage {


    @Test(priority = 4, groups= {"BAT"}, dataProvider = "registrationDataProvider")
    public void testRegistration(String firstName, String lastName, String emailAddress,String password){
        RegistrationPage registrationPage;
        registrationPage= new RegistrationPage();
        registrationPage.doRegistration(firstName,lastName,emailAddress,password);
        Assert.assertTrue(isElementVisible(registrationPage.registrationResultText));
    }
    @DataProvider(name="registrationDataProvider")
    public Object[][] testRegistrationDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("createAccount");
        return data;

    }

    //Registration using generate data "FAKER"
    @Test(priority = 5, groups= {"BAT"})
    public void testRegistrationFaker(){
        RegistrationPage registrationPage;
        registrationPage= new RegistrationPage();
        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String email = GenerateData.email();
        String password= GenerateData.password();
        registrationPage.doRegistration(firstName,lastName,email,password);
        Assert.assertTrue(isElementVisible(registrationPage.registrationResultText));
    }

}