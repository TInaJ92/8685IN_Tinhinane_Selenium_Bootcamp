package teststorelocator;

import base.BasePage;
import homepage.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import storelocatorpage.StoreLocatorPage;
import utils.ExcelData;

public class TestStoreLocator extends BasePage {
    @Test (priority = 1 ,groups = {"BAT"} ,dataProvider = "storeLocatorDataProvider")
    public void TestStoreLocator(String city){
       HomePage homePage = new HomePage();
        homePage.clickOnStoreLocatorLink();
        StoreLocatorPage storeLocatorPage = new StoreLocatorPage();
        storeLocatorPage.doFindLocator(city);

    }
   @DataProvider(name = "storeLocatorDataProvider")
    public String[][] findStoreLocatorDataProvider() {

       String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("findLocator");
        return data;
   }
}
