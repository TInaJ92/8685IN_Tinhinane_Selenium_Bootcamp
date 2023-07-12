package homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//a[@id='accommodations']")
    public WebElement staysButton;
    @FindBy(xpath="//input[@name='ss']")
    public WebElement whereAreYouGoingButton;

    @FindBy(xpath = "//div[@data-capla-component='b-index-lp-web-mfe/SearchBoxDesktopHorizontal']//form")
    public WebElement firstOption;

    @FindBy(xpath = "//button[normalize-space()='Check-in Date']")
    public WebElement dateSelectField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;
    @FindBy(xpath="//span[.=\"I'm flexible\"]")
    public WebElement flexibleButton;
    @FindBy(xpath="//div[@class='a1b3f50dcd be36d14cea b2fe1a41c3']/div[2]//span[@class='e50b5c7936']")
    public WebElement weekOption;
    @FindBy(xpath="//div[.='Aug2023']")
    public WebElement desiredMonth;

    @FindBy(xpath="//span[.='Select dates']")
    public WebElement selectDateButton;


    public void clickOnStaysButton(){
        safeClickOnElement(staysButton);
    }

    public void clickOnWhereYouGo(){
        safeClickOnElement(whereAreYouGoingButton);
    }

    public void clickOnFirstOprtionButton(){
        safeClickOnElement(firstOption);
    }

    public void clickOnDateSelectField(){
        safeClickOnElement(dateSelectField);
    }



    public void clickOnSearchButton(){
        safeClickOnElement(searchButton);
    }

    public void  doSearchHotels(){
        clickOnStaysButton();
        clickOnWhereYouGo();
        clickOnFirstOprtionButton();
        clickOnDateSelectField();
        safeClickOnElement(flexibleButton);
        safeClickOnElement(weekOption);
        safeClickOnElement(desiredMonth);
        safeClickOnElement(selectDateButton);

        clickOnSearchButton();

    }


}