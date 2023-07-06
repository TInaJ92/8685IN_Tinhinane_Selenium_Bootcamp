package test_search;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page_library.HomePage;
import page_library.SearchResultsPage;
import utils.ExcelData;

public class TestSearch extends BasePage {
    @Test(priority = 1, groups = {"BAT"},dataProvider = "searchDataProvider")
    public void testDoSearch (String searchTerm){
        HomePage homepage = new HomePage();
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        homepage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultsPage.resultsNumber));

    }
    @DataProvider(name = "searchDataProvider")
    public String[][] searchDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("testDoSearch");
        return data;
    }

}