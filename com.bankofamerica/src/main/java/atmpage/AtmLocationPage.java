package atmpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AtmLocationPage extends BasePage {
    public AtmLocationPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@id='q']")
    public WebElement searchBar;
    @FindBy(xpath="//button[@id='search-button']")
    public WebElement searchButton;

    @FindBy(xpath="//div[@id='aria-map-list-header']")
    public WebElement locationFound;



    public void enterZipOnSearchBar(String zipCode){
        sendKeysToElement(searchBar,zipCode);
    }
    public void clickOnSearchButton(){
        safeClickOnElement(searchButton);
    }
    public void doSearchAtmLocation(String zipCode){
        enterZipOnSearchBar(zipCode);
        clickOnSearchButton();
    }

}