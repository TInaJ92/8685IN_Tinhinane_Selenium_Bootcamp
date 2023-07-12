package homepage;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {
    @Test(priority = 1)
    public void testNavigationToApplication() {
        HomePage homepage = new HomePage();

        Assert.assertTrue(isElementVisible(homepage.logo));


}
}