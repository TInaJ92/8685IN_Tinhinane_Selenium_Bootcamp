package authentication;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithInvalidCredentials extends BasePage {
    public LoginPageWithInvalidCredentials(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@id=\"wrapper\"]")
    public WebElement registerSpace;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement EmailInputField;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement  PasswordInputField;

    @FindBy(xpath = "//button[@class='custom-button __b primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class=\"message_content\"]")
    public WebElement errorMessage;


    public void enterEmailAddress(String emailAddress){
        sendKeysToElement(EmailInputField,emailAddress);
    }
    public void enterPassword(String Password){
        sendKeysToElement(PasswordInputField, Password);
    }
    public void clickOnLoginButton(){
        safeClickOnElement(loginButton);
    }
    public  void  doSign(String invalidEmailAddress,String invalidPassword){

        enterEmailAddress(invalidEmailAddress);
        enterPassword(invalidPassword);
        clickOnLoginButton();




    }

}
