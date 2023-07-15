package resultpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends BasePage {


    public ResultPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='js-section-wrapper searchSection allSection']/div[@class='resultsSum']")
    public WebElement resultsSum;
}