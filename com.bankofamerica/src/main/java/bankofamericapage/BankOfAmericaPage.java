package bankofamericapage;

import atmpage.AtmLocationPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankOfAmericaPage extends BasePage {


    public BankOfAmericaPage(){
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//div[@class='logo-container']//img[@alt='Bank of America Logo']")
    public WebElement BankOfAmericaLogo;
    @FindBy(linkText = "Find your closest financial center or ATM")
    public WebElement findAtmLink;

    @FindBy(xpath="//a[@id='NAV_EN_ES']")
    public WebElement languageButton;
    @FindBy(xpath="//a[@id='navChecking']/span[@class='title']")
    public WebElement cuentasDeChequesButton;

    public AtmLocationPage clickOnFindAtmLink(){
        safeClickOnElement(findAtmLink);
        return new AtmLocationPage();
    }
    public void clickOnCuentasDeChequesButton(){
        safeClickOnElement(cuentasDeChequesButton);
    }
    public void clickOnEnEspagnolButton(){
        safeClickOnElement(languageButton);

    }
    public void clickOnInEnglish(){
        safeClickOnElement(languageButton);
    }
    public void doSwitchLanguages(){
        clickOnEnEspagnolButton();
        clickOnCuentasDeChequesButton();
        clickOnInEnglish();
    }
}
