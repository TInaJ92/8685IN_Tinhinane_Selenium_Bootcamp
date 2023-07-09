package test_atmlocator;

import atmpage.AtmLocationPage;
import bankofamericapage.BankOfAmericaPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

import java.util.Set;

public class TestLocatorAtm extends BasePage {
    /* Test Case: ATM Locator
     *1.Open the Bank of America website
     *2.Click on "Find your closest center or ATM"
     *3.Enter a valid location or use the current location option.
     *4.Submit the search
     * 5.Verify that the result page display a list of ATMs in the specified location or nearby, along with their details and directions.
     */

    @Test(priority = 1, groups = {"BAT"}, dataProvider = "searchAtmLocationDataProvider")

    public void testSearchAtmLocator(String zipCode) {

        BankOfAmericaPage bankOfAmericaPage = new BankOfAmericaPage();
        AtmLocationPage atmLocationPage=bankOfAmericaPage.clickOnFindAtmLink();
        atmLocationPage.doSearchAtmLocation(zipCode);
        Assert.assertTrue(isElementVisible(atmLocationPage.locationFound));

    }

    @DataProvider(name = "searchAtmLocationDataProvider")
    public String[][] searchAtmDataProvider()
    {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSearchAtmLocation");
        return data;

    }

    /* Test Case: ATM Locator with invalid zip code
     *1.Open the Bank of America website
     *2.Click on "Find your closest center or ATM"
     *3.Enter an invalid location or use the current location option.
     *4.Submit the search
     * 5.Verify that the result page display an error message "No locations found" .
     */
    @Test(priority = 2, groups = {"BAT"}, dataProvider = "searchAtmLocationInvalidZipDataProvider")

    public void testSearchAtmLocatorWithInvalidZip(String zipCode) {

        BankOfAmericaPage bankOfAmericaPage = new BankOfAmericaPage();
        AtmLocationPage atmLocationPage=bankOfAmericaPage.clickOnFindAtmLink();
        atmLocationPage.doSearchAtmLocation(zipCode);
        Assert.assertTrue(isElementVisible(atmLocationPage.locationFound));

    }

    @DataProvider(name = "searchAtmLocationInvalidZipDataProvider")
    public String[][] searchAtmInvalidZipDataProvider()
    {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("invalidZip");
        return data;

    }
}
