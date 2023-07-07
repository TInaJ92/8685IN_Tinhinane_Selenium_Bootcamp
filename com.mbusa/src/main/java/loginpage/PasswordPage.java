package loginpage;

import base.BasePage;


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
    public void  authenticatePassword(String password){
        inputPassword(password);
        clickOnNextButton();



    }
}