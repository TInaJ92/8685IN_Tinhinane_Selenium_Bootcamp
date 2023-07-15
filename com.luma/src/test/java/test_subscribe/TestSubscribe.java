package test_subscribe;


import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestSubscribe extends BasePage {

    @Test(priority = 10 , groups = {"BAT"},dataProvider = "doSubscribeDataProvider")
    public void testSubscribe(String email){
        HomePage homepage= new HomePage();

        homepage.DoSubscribe(email);

        Assert.assertTrue(isElementVisible(homepage.confirmSubscriptionMessage));
    }
    @DataProvider(name="doSubscribeDataProvider")
    public Object[][] testSubscribeDataProvider() {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSubscribe");
        return data;

    }
}