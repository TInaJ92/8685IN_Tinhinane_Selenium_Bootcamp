package homepage;

import base.BasePage;
import futurechartspage.FutureChartPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resultpage.ResultPage;

public class HomePage extends BasePage {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"userAccount\"]/div/a[1]")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@id='loginFormUser_email']")
    public WebElement emailInputField;
    @FindBy(xpath = "//input[@id='loginForm_password']")
    public WebElement passwordInputField;
    @FindBy(xpath = "//div[@id='signup']/a[.='Sign In']")
    public WebElement sigInButton;
    @FindBy(xpath = "//span[@class='myAccount topBarText']")
    public WebElement userName;
    @FindBy(xpath = "//input[@class='searchText arial_12 lightgrayFont js-main-search-bar']")
    public WebElement searchBar;

    @FindBy(xpath = "//label[@class='searchGlassIcon js-magnifying-glass-icon']")
    public WebElement searchIcon;
    @FindBy(xpath = "//div[@class='js-section-wrapper searchSection allSection']/div[@class='resultsSum']")
    public WebElement resultsSum;

    @FindBy(xpath = "//span[@class='myAccount topBarText']")
    public WebElement myNameTopBarText;
    @FindBy(xpath = "//a[normalize-space()='Sign out']")
    public WebElement signOutButton;

    @FindBy(xpath = "//a[@href='//www.investing.com/charts/']")
    public WebElement chartsLink;
    @FindBy(xpath = "//a[.='Futures Chart']")
    public WebElement futureChartsButton;

    @FindBy(xpath = "//tbody[tr[contains(@data-pair_url,'/indices/us-spx-500-futures-chart?')]]")
    public WebElement indicesTable;

    @FindBy(xpath = "//tbody[tr[contains(@data-pair_url,'/commodities/natural-gas-streaming-chart')]]")
    public WebElement commoditiesTable;

    @FindBy(xpath = "//ul[@id='quotesBoxWithTabsTop']/li/a[starts-with(text(),'Commodities')]")
    public WebElement commoditiesTab;

    @FindBy(xpath = "//ul[@id='quotesBoxWithTabsTop']/li/a[contains(text(),'Bonds')]")
    public WebElement bondsTab;

    @FindBy(xpath = "//ul[@id='quotesBoxWithTabsTop']/li/a[contains(text(),'Stocks')]")
    public WebElement stocksTab;

    @FindBy(xpath = "//tbody[tr[contains(@data-pair_url,'rates-bonds')]]")
    public WebElement bondsTable;

    @FindBy(xpath = "//tbody[tr[contains(@data-pair_url,'equities')]]")
    public WebElement stocksTable;




    public void clickOnLoginLink() {
        safeClickOnElement(loginLink);

    }

    public void enterEmailAddress(String emailAddress) {
        safeClickOnElement(emailInputField);

        sendKeysToElement(emailInputField, emailAddress);
    }

    public void enterPassword(String password) {
        sendKeysToElement(passwordInputField, password);
    }

    public void clickSignIn() {
        safeClickOnElement(sigInButton);
    }

    public void doSignIn(String emailAddress, String password) {
        clickOnLoginLink();
        enterEmailAddress(emailAddress);
        enterPassword(password);
        clickSignIn();
    }

    public void enterSearch(String searchTerm) {
        sendKeysToElement(searchBar, searchTerm);
    }

    public void clickOnSearchIcon() {
        safeClickOnElement(searchIcon);
    }

    public ResultPage doSearch(String searchTerm) {
        enterSearch(searchTerm);
        clickOnSearchIcon();
        return new ResultPage();
    }

    public void hoverOverMyNameText() {
        hoverOverElement(myNameTopBarText);
    }

    public void clickOnSignOutButton() {
        safeClickOnElement(signOutButton);
    }

    public void doSignOut() {
        hoverOverMyNameText();
        clickOnSignOutButton();
    }

    public void clickOnChartsLink() {
        safeClickOnElement(chartsLink);
    }

    public FutureChartPage clickOnFuturesChart() {
        safeClickOnElement(futureChartsButton);
        return new FutureChartPage();
    }

    public void clickOnCommoditiesTab(){
        safeClickOnElement(commoditiesTab);
    }

    public void clickOnBondsTab(){
        safeClickOnElement(bondsTab);
    }

    public void clickOnStocksTab(){
        safeClickOnElement(stocksTab);
    }

}
