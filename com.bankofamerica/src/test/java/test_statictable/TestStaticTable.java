package test_statictable;

import base.BasePage;
import homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStaticTable extends BasePage {

    @Test
    public void testStaticTable() {


        HomePage homePage = new HomePage();
        // Verify the table is displayed
        Assert.assertTrue(isElementVisible(homePage.tableForBoa));

        // Verify the number of rows in the table
        int expectedRowCount = 1; // Set the expected row count
        Assert.assertEquals(expectedRowCount,homePage.getRowCount());

        // Iterate through each row and verify the number of cells
        int rowIndex = 1; // Start from the first row
        int expectedCellCount = 1; //

    }
}