package test_searchbar;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import searchbar.SearchBar;

public class TestSearchBar extends BasePage {

    @Test
    public void testSearchBar(){
        HomePage homePage=new HomePage();
        SearchBar searchBar=new SearchBar();
        Assert.assertTrue(isElementVisible(searchBar.textSearchTerm));
    }
}
