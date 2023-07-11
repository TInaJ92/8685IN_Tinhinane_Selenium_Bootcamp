package homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends BasePage {
    public ResultPage(){
        PageFactory.initElements(driver,this);

    }
   @FindBy (xpath = "//div[@id='content']/div[2]//div[@class='form__radio-indicator']")
    public WebElement collisionCenterRadioButton;

public void clickOnCollisionCenterRadioButton(){
    boolean isSelected= collisionCenterRadioButton.isSelected();
    safeClickOnElement(collisionCenterRadioButton);
}
}