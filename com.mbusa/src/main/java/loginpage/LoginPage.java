package loginpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement inputEmailBar;

    @FindBy(xpath = "//button[@id='continue']")
    public WebElement continueButton;


    public void inputEmail(String email) {
        sendKeysToElement(inputEmailBar, email);
    }

    public void clickOnContinueButton() {
        safeClickOnElement(continueButton);
    }

    public PasswordPage authenticateEmail(String email) {
        inputEmail(email);
        clickOnContinueButton();

        return new PasswordPage();
    }
}