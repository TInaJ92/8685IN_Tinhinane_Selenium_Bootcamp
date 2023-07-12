package searchpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {

    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//h1[normalize-space()='Virginia Beach: 100 properties found']")
    public WebElement searchResultHeader;


}