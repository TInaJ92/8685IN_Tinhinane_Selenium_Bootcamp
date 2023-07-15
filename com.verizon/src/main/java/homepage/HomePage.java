package homepage;


import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resultpage.ResultsPage;

public class HomePage extends BasePage {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@id='gnav20-search-icon']")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@id='search_box_gnav_input']")
    public WebElement inputSearchBox;

    @FindBy(xpath = "//a[@aria-label='iPhone 1 of 9']//span[contains(text(),'iPhone')]")
    public WebElement iPhoneSearchTerm;

    @FindBy(xpath = "//a[@data-label='Stores']")
    public WebElement storesButton;

    @FindBy(xpath = "//input[@id='storesData']")
    public WebElement storeSearchBar;

    @FindBy(xpath = "//li[@tabindex='-1']")
    public WebElement searchDropdown;





    public void clickOnSearchButton(){
        safeClickOnElement(searchButton);

    }

    public void enterSearchTerm(){
        String searchTerm = "iphone";
        sendKeysToElement(inputSearchBox, searchTerm);
    }

    public void hoverOveriPhone(){
        hoverOverElement(iPhoneSearchTerm);
    }

    public void clickOnSearchTerm(){
        safeClickOnElement(iPhoneSearchTerm);
    }

    public void searchTerm(){
        clickOnSearchButton();
        enterSearchTerm();
        hoverOveriPhone();
        clickOnSearchTerm();
    }



    public void clickOnStoresButton(){
        safeClickOnElement(storesButton);
    }

    public void enterZipCode(String zip){
        sendKeysToElement(storeSearchBar, zip);
    }

    public void clickOnZipDropdown(){
        safeClickOnElement(searchDropdown);
    }

    public ResultsPage doSearch(String zip){
        clickOnStoresButton();
        enterZipCode(zip);
        clickOnZipDropdown();

        return new ResultsPage();
    }

}







