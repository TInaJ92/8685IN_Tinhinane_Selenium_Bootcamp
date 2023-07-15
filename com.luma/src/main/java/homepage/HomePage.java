package homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import searchresultpage.SearchResultPage;

import javax.naming.directory.SearchResult;

public class HomePage extends BasePage {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/']")
    public WebElement logo;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement inputSearchBar;

    @FindBy(xpath = "//button[@class='action search']")
    public WebElement buttonActionSearch;


    @FindBy(xpath = "//span[.='Women']")
    public WebElement womenButton;
    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/women/tops-women.html']")
    public WebElement topsButton;
    @FindBy(xpath = "//div[.='Category']")
    public WebElement categoryButton;
    @FindBy(xpath = " //*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[1]/a")
    public WebElement jacketButton;
    @FindBy(xpath = "//div[@class='filter-current']//li[@class='item']")
    public WebElement categoryJacketResult;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement inputValidEmailField;
    @FindBy(xpath = "//span[.='Subscribe']")
    public WebElement subscribeButton;
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement confirmSubscriptionMessage;


    @FindBy(xpath = "//div[@class='panel header']//button[@class='action switch']")
    public WebElement myNameDropDown;
    @FindBy(xpath = "//li[@class='customer-welcome active']//a[contains(.,'Sign Out')]")
    public WebElement logOutButton;
    @FindBy(xpath = "//span[@class='base']")
    public WebElement messageLogOut;
    @FindBy(xpath = "//div[@class='panel header']//span[@class='not-logged-in']")
    public WebElement defaultWelcomeMsgButton;


    // single responsibility

   /* public void clickDefaultWelcomeMsgButton() {
        safeClickOnElement(buttonDefaultWelcomeMsg);
    }*/

    public void inputSearchTerm(String searchTerm) {
        clearSendKeysToElement(inputSearchBar, searchTerm);
    }

    public void clickActionSearchButton() {
        safeClickOnElement(buttonActionSearch);
    }

    public void getInputEmail(String email) {
        sendKeysToElement(inputValidEmailField, email);
    }

    public void clickOnSubscribeButton() {
        safeClickOnElement(subscribeButton);
    }

    public void DoSubscribe(String email) {
        getInputEmail(email);
        clickOnSubscribeButton();
    }


    public void clickOnMyNameDropDown() {
        safeClickOnElement(myNameDropDown);
    }

    public void clickOnLogOutButton() {
        safeClickOnElement(logOutButton);
    }
    public void clickOnWomenButton() {
        hoverOverElement(womenButton);
    }

    public void clickOnTopsButton() {
        safeClickOnElement(topsButton);
    }

    public void clickOnCategoryButton() {
        safeClickOnElement(categoryButton);
    }

    public void clickOnJacketsButton() {
        safeClickOnElement(jacketButton);
    }

    public void doFilterTo() {
        clickOnWomenButton();
        clickOnTopsButton();
        clickOnCategoryButton();
        clickOnJacketsButton();

    }

    public void doLogOut() {
        clickOnMyNameDropDown();
        clickOnLogOutButton();

    }


    public SearchResultPage doSearch(String searchTerm) {
        inputSearchTerm(searchTerm);
        clickActionSearchButton();
        return new SearchResultPage();
    }
}


