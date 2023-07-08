
package homepage;

import accountsettingpage.AccountSettingPage;
import authenticationpage.SignInPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import authenticationpage.SignUpPage;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@title='Sign Up']")
    public WebElement signupButton;

    @FindBy(xpath = "//div[@id='username']/button/span")
    public WebElement loggedInUsername;
    @FindBy(xpath = "//span[.='Nancy']")
    public WebElement userName;
    @FindBy(xpath = "//a[.='Sign In']")
    public WebElement signInLink;

    @FindBy(xpath = "//i[@class='storyicon down2StoryIcon']")
    public WebElement nameDropDown;

    @FindBy(xpath = "//a[@id='headerSignOut']")
    public WebElement signOutLink;
    @FindBy(xpath = "//a[@id='headerMyAccount']")
    public WebElement myAccountButton;
    public HomePage(){

        PageFactory.initElements(driver, this);
    }

    public SignUpPage clickOnSignUpButton(){
        safeClickOnElement(signupButton);
        return new SignUpPage();
    }



    public SignInPage clickOnSignInLink(){
        safeClickOnElement(signInLink);
        return new SignInPage();
    }
    public void hoverOverNameHeader(){

        hoverOverElement(nameDropDown);
    }
    public void clickOnSignOut(){
        safeClickOnElement(signOutLink);
    }
    public HomePage doSignOut(){
        hoverOverNameHeader();
        clickOnSignOut();
        return  new HomePage();
    }

    public void clickOnMyAccount(){
        safeClickOnElement(myAccountButton);
    }
    public AccountSettingPage hoverClickOnAccount(){
        hoverOverNameHeader();
        clickOnMyAccount();
        return new AccountSettingPage();
    }
}