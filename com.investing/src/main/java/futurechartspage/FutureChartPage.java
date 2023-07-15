package futurechartspage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FutureChartPage extends BasePage {

    public FutureChartPage(){

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[.='Add to Watchlist']")
    public WebElement addToWatchListButton;
    @FindBy(xpath = "//input[@class='checkbox']")
    public WebElement watchListCheckBox;

    @FindBy(xpath = "//a[.='Apply']")
    public WebElement applyButton;
    @FindBy(xpath = "//div[@class='tooltipPopup addToPortfolioPop js-just-multipair']/div[@class='content reply js-status-message']")
    public WebElement successfullyAddedMessage;



    public void clickOnAddToWatchList(){
        safeClickOnElement(addToWatchListButton);
    }
    public void clickOnWatchListCheckBox(){
        safeClickOnElement(watchListCheckBox);
    }
    public void clickOnApplyButton(){
        safeClickOnElement(applyButton);
    }
    public void doAddToWatchList(){
        clickOnAddToWatchList();
        clickOnWatchListCheckBox();
        clickOnApplyButton();
    }
}