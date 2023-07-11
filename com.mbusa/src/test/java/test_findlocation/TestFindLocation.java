/*package test_findlocation;

import base.BasePage;
import homepage.HomePage;
import homepage.ResultPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestFindLocation extends BasePage {
    @Test (priority = 1,groups = {"BAT"},dataProvider = "FindDealerDataProvider")
    public void testFindDealer(String zipCode){
        HomePage homePage= new HomePage();
        homePage.doFindDealer(zipCode);
        ResultPage resultPage = new ResultPage();
        resultPage.clickOnCollisionCenterRadioButton();

    }
    @DataProvider(name = "FindDealerDataProvider")
    public String[][] testFindDealer() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doFindDealer");
        return data;

    }


}
*/