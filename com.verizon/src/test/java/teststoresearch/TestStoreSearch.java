package teststoresearch;



import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resultpage.ResultsPage;
import utils.ExcelData;


public class TestStoreSearch extends BasePage {
    @Test(priority= 1, groups= {"BAT"},dataProvider = "searchDataProvider")

    public void testSearchResult(String zip){

        HomePage homePage=new HomePage();
       ResultsPage resultsPage= new ResultsPage();
        homePage.doSearch(zip);
        Assert.assertTrue(isElementVisible(resultsPage.searchResultItems));


    }
    @DataProvider(name="searchDataProvider")
    public Object [][] searchResultDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("verizon_zip");
        return data;

    }
}