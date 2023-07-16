package test_comparevehicle;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import vehiclepage.VehiclePage;

public class TestCompareVehicles extends BasePage {

    @Test(priority = 1, groups = {"BAT"})
    public void testDoCompareVehicle(){
        HomePage homePage=new HomePage();

        VehiclePage vehiclePage= homePage.clickOnExploreButton();
        vehiclePage.doCompare();
        Assert.assertTrue(isElementVisible(vehiclePage.featuresHighlightsText));
    }
}