package testsearch;

import base.BasePage;
import homepage.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestSearch extends BasePage {
    @Test( dataProvider = "searchDataProvider")

    public void testSearch(String model, String year) {
        HomePage homePage = new HomePage();
        homePage.doSearch(model, year);
    }

    @DataProvider(name = "searchDataProvider")
    public String[][] searchDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSearch");
        return data;

    }
}
