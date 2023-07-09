package test_boabutton;

import bankofamericapage.BankOfAmericaPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class TestBoaButton extends BasePage {

    @Test(priority = 1, groups = {"BAT"})
    public void testBoaButton() {

        HomePage homePage = new HomePage();
        BankOfAmericaPage bankOfAmericaPage = new BankOfAmericaPage();
        homePage.clickOnBoaButton();
        // Get the handle of the current window
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window : windowHandles) {
            // Check if it is the current window or the main window
            if (!window.equals(currentWindowHandle)) {
                // Switch the focus to the new window
                driver.switchTo().window(window);
                break;
            }

        }
        Assert.assertTrue(isElementVisible(bankOfAmericaPage.BankOfAmericaLogo));
    }
}
