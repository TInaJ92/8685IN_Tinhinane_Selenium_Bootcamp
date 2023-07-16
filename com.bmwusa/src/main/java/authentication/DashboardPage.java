package authentication;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shoppingpage.ShoppingPage;

public class DashboardPage extends BasePage {
    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@id='accountsBtn']")
    public WebElement myAccountButton;
    @FindBy(xpath="//span[.='Log Out of My BMW']")
    public WebElement logOutButton;

    @FindBy(xpath ="//span[.='My BMW']")
    public WebElement myBmwInTheHeader;
    @FindBy(xpath = "//span[.='Shopping']")
    public WebElement shoppingLink;
    @FindBy(xpath = "//a[@href='https://www.shopbmwusa.com/']")
    public WebElement shopPartsLink;


    public void clickOnMyBmw(){
        safeClickOnElement(myBmwInTheHeader);
    }
    public void clickOnLogOutButton(){
        safeClickOnElement(logOutButton);
    }

    public LoginPage doLogOut(){
        clickOnMyBmw();
        clickOnLogOutButton();
        return new LoginPage();
    }

    public void  clickOnShoppingLink(){
        safeClickOnElement(shoppingLink);
    }
    public void  clickOnShopPartsLink(){
        safeClickOnElement(shopPartsLink);
    }

    public ShoppingPage switchToNewTab(){
        clickOnShoppingLink();
        clickOnShopPartsLink();
        switchToTab();

        return new ShoppingPage();
    }
}