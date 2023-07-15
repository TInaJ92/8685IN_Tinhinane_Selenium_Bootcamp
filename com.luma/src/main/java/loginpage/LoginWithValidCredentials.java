package loginpage;

import base.BasePage;
import homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithValidCredentials extends BasePage {
    HomePage homePage=new HomePage();

    @FindBy(xpath = "//div[@class='panel header']//a[contains(.,'Sign In')]")
    public WebElement loginLink;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement inputEmail;
    @FindBy(xpath = "//input[@name='login[password]']")
    public WebElement inputPassword ;
    @FindBy(xpath = "//button[@class='action login primary']/span[.='Sign In']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='panel header']//span[@class='logged-in']")
    public WebElement resultLoginMessage;


    public  LoginWithValidCredentials(){
        PageFactory.initElements(driver,this);
    }

    public void clickLoginLink() {
        safeClickOnElement(loginLink);
    }
    public void setInputEmail(String validEmail){
        sendKeysToElement(inputEmail, validEmail);
    }
    public void setInputPassword(String validPassword){
        sendKeysToElement(inputPassword, validPassword);
    }
    public void clickLoginButton() {
        safeClickOnElement(loginButton);
    }

    public  HomePage getLoginPage(String validEmail, String validPassword){
        clickLoginLink();
        setInputEmail(validEmail);
        setInputPassword(validPassword);
        clickLoginButton();
        return new HomePage();
    }


}