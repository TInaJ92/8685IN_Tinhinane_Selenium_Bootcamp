package test_app_verizon;

import base.BasePage;
import homepage.HomePage;
import org.testng.annotations.Test;


public class TestDoSearch extends BasePage {

    @Test(priority = 1, groups = "smoke")
    public void testDoSearch(){
        HomePage homePage = new HomePage();
        homePage.searchTerm();

    }
}