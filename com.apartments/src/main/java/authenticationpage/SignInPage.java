package authenticationpage;

import base.BasePage;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInPage extends BasePage {

    @FindBy(xpath="//*[@id='username']")
    public WebElement emailAddressInput;

    @FindBy(xpath ="//*[@id=\"password\"]")
    public WebElement passwordInput;

    @FindBy(xpath ="//*[@id=\"loginButton\"]")
    public WebElement signInButton;

    @FindBy(xpath="//*[@id=\"iFrameResizer0\"]")
    public WebElement element;

    @FindBy(xpath="//*[@id=\"forgotPasswordLink\"]")
    public WebElement forgetPasswordLink;

    public SignInPage(){

        PageFactory.initElements(driver,this);
    }


    public void switchToIframe( ) {
        switchToFrameByElement(element);
    }

    public void enterEmailAddress(String email){
        sendKeysToElement(emailAddressInput,email);
    }
    public void enterPassword(String password){
        sendKeysToElement(passwordInput,password);
    }
    public void clickOnSignInButton(){
        safeClickOnElement(signInButton);
    }

    public HomePage doSignIn(String email, String password){
        switchToIframe();
        enterEmailAddress(email);
        enterPassword(password);
        clickOnSignInButton();
        return new HomePage();
    }
}