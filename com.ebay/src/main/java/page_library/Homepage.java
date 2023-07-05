package page_library;


import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {
    public Homepage() {

        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='gh-ac']")
    public WebElement searchBar;
    @FindBy(xpath = "//input[@id='gh-btn']")
    public WebElement searchButton;


    public void enterSearchTerm(String searchTerm){
        sendKeysToElement(searchBar, searchTerm);
    }
    public void clickOnSearchButton(){
        safeClickOnElement(searchButton);
    }

    public void doSearch(String searchTerm){
        enterSearchTerm(searchTerm);
        clickOnSearchButton();
    }
}
