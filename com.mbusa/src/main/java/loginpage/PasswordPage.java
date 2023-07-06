package mbusa.pom.loginpage;

import base.BasePage;
import mbusa.pom.homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage extends BasePage {
    public PasswordPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='password']")
    public WebElement inputPasswordBar;

    @FindBy(xpath = "//button[@id='confirm']")
    public WebElement nextButton;

    public void inputPassword(String password){
        sendKeysToElement(inputPasswordBar, password);
    }
    public void clickOnNextButton(){
        safeClickOnElement(nextButton);
    }
    public HomePage authenticatePassword(String password){
        inputPassword(password);
        clickOnNextButton();

        return new HomePage();

    }
}