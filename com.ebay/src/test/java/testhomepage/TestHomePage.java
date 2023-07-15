package testhomepage;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import homepage.HomePage;

public class TestHomePage extends BasePage {
    @Test
    public void TestHomePage(){
        HomePage homepage = new HomePage();
        Assert.assertTrue(isElementVisible(homepage.searchButton));
    }
}
