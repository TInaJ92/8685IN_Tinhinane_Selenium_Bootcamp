package storelocatorpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreLocatorPage extends BasePage {
    public StoreLocatorPage (){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//input[@id='q']")
    public WebElement cityInputField;

    @FindBy(xpath ="//button[@class='search-button Locator-button Locator-button--search js-search-button']" )
    public WebElement arrowIcon;
    public void enterCity(String city){
        sendKeysToElement(cityInputField,city);
    }
    public void clickOnArrowIcon(){
        safeClickOnElement(arrowIcon);
    }
    public void doFindLocator(String city){
        enterCity(city);
        clickOnArrowIcon();
    }
}

