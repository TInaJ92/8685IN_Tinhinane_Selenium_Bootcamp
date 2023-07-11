package homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Scanner;

public class HomePage extends BasePage {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class=\"header-account-button\"]")
    public WebElement signInButton1;
    @FindBy(xpath = "//div[@class='header-item store-locator store-locator-two']//b[.='Store Locator']")
    public WebElement storeLocatorLink;

    @FindBy(xpath = "//b[.='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[@href='https://mymobile.optimum.com/login']")
    public WebElement mobileOption;

    public void clickOnStoreLocatorLink() {
        safeClickOnElement(storeLocatorLink);
    }

    public void hoverOverSignInButton() {
        hoverOverElement(signInButton);
    }

    public void clickOnMobileOption() {
        safeClickOnElement(mobileOption);
        switchToTab();
    }

    public void clickOnSignInMobile() {
        hoverOverSignInButton();
        clickOnMobileOption();
    }
}