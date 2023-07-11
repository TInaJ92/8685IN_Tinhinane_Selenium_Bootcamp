package homepage;

import base.BasePage;

import loginpage.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[contains(@aria-label,'OK')]")
    public WebElement okButton;

    @FindBy(xpath = "//span[@class='global-headerbutton-label global-headerbutton-utility-inner']")
    public WebElement myAccountButton;

    @FindBy(id = "text-zoom-tracker")
    public WebElement iframe;

    @FindBy(xpath = "//button[@class='nav-profilelogin nav-profilebutton button button_primary button--wide ']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='global-headerbutton-label global-headerbutton-utility-inner']")
    public WebElement usernameHeader;
    @FindBy(xpath = "//span[.='Find a Dealer']")
    public WebElement findADealerButton;
    @FindBy(xpath = "//div[@class='form__input form__input--inline']/input[@class='form__input-field form__input-field--can-reset']")
    public WebElement zipCodeInputField;
    @FindBy(xpath = "//button[@class='button button_primary']")
    public WebElement searchButton;
    @FindBy(xpath ="//ul[@class='location-search__list']/li[contains(.,'Philadelphia, PA')]")
    public WebElement firstOption;
    public void clickOnFirstOption(){
        safeClickOnElement(firstOption);
    }
    public void clickOnMyAccountButton(){

        safeClickOnElement(myAccountButton);
    }
    public void switchToIframe(){

        driver.switchTo().frame(iframe);
    }
    public void clickOnSearchButton(){
        safeClickOnElement(searchButton);

    }
    public void clickOnFindADealerButton(){
        safeClickOnElement(findADealerButton);

    }
    public void enterZipCode(String zipCode){
        sendKeysToElement(zipCodeInputField,zipCode);

    }
    public void clickOnLoginButton(){
        safeClickOnElement(loginButton);

    }



    public void clickOnOkButton()
    {

        safeClickOnElement(okButton);

    }
    public void  login(){
        getVisibleElement(myAccountButton);
        clickOnByTabKey();
        clickOnMyAccountButton();
        //  switchToIframe();
        clickOnLoginButton();


    }
    public ResultPage doFindDealer(String zipCode) {
        clickOnFindADealerButton();
        enterZipCode(zipCode);
        clickOnFirstOption();
        clickOnSearchButton();
        return new ResultPage();
    }
}


