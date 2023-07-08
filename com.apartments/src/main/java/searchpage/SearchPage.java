

package searchpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {

    public SearchPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//input[@id='quickSearchLookup']")
    public WebElement searchBar;
    @FindBy(xpath="//span[.='Search']")
    public WebElement searchButton;


    public void enterSearchTerm(String searchTerm){
        sendKeysToElement(searchBar, searchTerm);
    }

    public void  clickOnSearchButton(){
        safeClickOnElement(searchButton);

    }

    public ResultSearchPage searchTerm(String searchTerm){
        enterSearchTerm(searchTerm);
        clickOnSearchButton();
        return new ResultSearchPage();

    }
}