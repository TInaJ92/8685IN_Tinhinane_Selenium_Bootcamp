package loginpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {

    public void loginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInputField;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputField;
    @FindBy(xpath = "//button[@class='btn primary sigInButton']")
    public WebElement signInButton;
    @FindBy(xpath = "//div[@class='errorMessage']")
    public WebElement errorMessage;
    public void enterInvalidEmail(String email){
        sendKeysToElement(emailInputField,email);
    }
    public void enterInvalidPassword(String password){
        sendKeysToElement(passwordInputField,password);
    }
    public void clickOnSignInButton(){
        safeClickOnElement(signInButton);
    }

    public void doSignIn(String email,String password){
        enterInvalidEmail(email);
        enterInvalidPassword(password);
        clickOnSignInButton();
    }
}
