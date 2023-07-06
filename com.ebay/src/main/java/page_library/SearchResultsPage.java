

package page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {
    public SearchResultsPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//h1[@class='srp-controls__count-heading']")
    public WebElement resultsNumber;

}