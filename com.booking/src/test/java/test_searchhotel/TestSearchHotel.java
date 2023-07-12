package test_searchhotel;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import searchpage.SearchPage;

public class TestSearchHotel extends BasePage {
    @Test(priority = 1, groups = {"BAT"})

    public void testDoSearchHotel(){
        HomePage homePage = new HomePage();
        homePage.doSearchHotels();
        SearchPage searchPage = new SearchPage();
        Assert.assertTrue(isElementVisible(searchPage.searchResultHeader));
    }
}
