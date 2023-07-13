package authenticationpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {

    public SignUpPage() {
        PageFactory.initElements(driver, this);
    }



    @FindBy(id = "signupFirstName")
    public WebElement signUpFirstNameInput;

    @FindBy(id = "signupLastName")
    public WebElement signUpLastNameInput;

    @FindBy(id = "signupEmail")
    public WebElement signUpEmailInput;

    @FindBy(id = "signupIndustryProfessional")
    public WebElement iAmAnIndustryProfessionalBox;

    @FindBy(xpath = "//button[@title='Select']")
    public WebElement selectDropdown;

    @FindBy(xpath = "//span[contains(text(),'Property Manager')]")
    public WebElement propertyManagerDropdown;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    public WebElement iAmNotARobotBox;

    @FindBy(id = "signupBtn")
    public WebElement signUpButtonSecond;

    @FindBy(id = "newPw")
    public WebElement createPasswordInput;

    @FindBy(id = "NewPasswordConfirm")
    public WebElement confirmPasswordInput;

    @FindBy(id = "setNewPassword")
    public WebElement setPasswordButton;



    public void doSignUp(String firstName, String lastName, String email, String password) {

        sendKeysToElement(signUpFirstNameInput, firstName);
        sendKeysToElement(signUpLastNameInput, lastName);
        sendKeysToElement(signUpEmailInput, email);
        safeClickOnElement(iAmAnIndustryProfessionalBox);
        safeClickOnElement(selectDropdown);
        safeClickOnElement(propertyManagerDropdown);
        safeClickOnElement(iAmNotARobotBox);
        safeClickOnElement(signUpButtonSecond);
        sendKeysToElement(createPasswordInput, password);
        sendKeysToElement(confirmPasswordInput, password);
        safeClickOnElement(setPasswordButton);


    }
}