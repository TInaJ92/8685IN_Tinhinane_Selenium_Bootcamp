package homepage;

import base.BasePage;

import loginpage.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import searchpage.SearchPage;
import shoppingpage.ShopPartsPage;
import vehiclepage.VehiclePage;

public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[contains(@aria-label,'OK')]")
    public WebElement okButton;

   // @FindBy(xpath = "//span[@class='global-headerbutton-label global-headerbutton-utility-inner']")
   @FindBy(xpath = "//span[contains(.,'My Account')]")
    public WebElement myAccountButton;

    @FindBy(id = "text-zoom-tracker")
    public WebElement iframe;

    @FindBy(xpath = "//button[contains(.,'Log In')]")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='global-headerbutton-label global-headerbutton-utility-inner']")
    public WebElement usernameHeader;
    @FindBy(xpath="//div[@class='full-height-hero__image-container full-height-hero__image-container--width']//a[.='Explore']")
    public WebElement exploreButton;

    @FindBy(xpath = "//span[.='Shopping']")
    public WebElement shoppingLink;

    @FindBy(xpath="//span[.='Find a Dealer']")
    public WebElement findDealer;
    @FindBy(xpath = "//div[@class='form__input form__input--inline']/input[@class='form__input-field form__input-field--can-reset']")
    public WebElement zipCodeInputField;
    @FindBy(xpath = "//button[@class='button button_primary']")
    public WebElement searchButton;

    @FindBy(xpath= "//ul[@class='location-search__list']/li[contains(.,'Philadelphia, PA')]")
    public WebElement firstOption;

    public void clickOnMyAccountButton(){

        safeClickOnElement(myAccountButton);
    }
    public void switchToIframe(){

        driver.switchTo().frame(iframe);
    }
    public void clickOnLoginButton(){
        safeClickOnElement(loginButton);

    }
    public void clickOnOkButton()
    {
        safeClickOnElement(okButton);
    }
    public LoginPage doLogin(){
        getVisibleElement(myAccountButton);
        clickOnByTabKey();
        clickOnMyAccountButton();
        //  switchToIframe();
        getVisibleElement(loginButton);
        clickOnLoginButton();

        return new LoginPage();
    }

    public VehiclePage clickOnExploreButton(){
        safeClickOnElement(exploreButton);
        return new VehiclePage();
    }
    public ShopPartsPage clickOnShoppingLink(){
        safeClickOnElement(shoppingLink);
        return new ShopPartsPage();
    }

    public void clickOnFindDealer(){
        safeClickOnElement(findDealer);
    }
    public void enterZipCode(String zipCode){
        //safeClickOnElement(zipCodeInputField);
        sendKeysToElement(zipCodeInputField,zipCode);
    }
    public void clickOnFirstOption(){
        safeClickOnElement(firstOption);
    }
    public void clickOnSearchButton(){
        safeClickOnElement(searchButton);
    }

    public SearchPage doFindDealer(String zipCode){
        clickOnFindDealer();
        enterZipCode(zipCode);
        clickOnByTabKey();
        clickOnFirstOption();
        clickOnSearchButton();
        return new SearchPage();
    }

}