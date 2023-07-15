package resultpage;



import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage extends BasePage {

    public ResultsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='slSearch-Distance0Id']")
    public WebElement searchResultItems;
}