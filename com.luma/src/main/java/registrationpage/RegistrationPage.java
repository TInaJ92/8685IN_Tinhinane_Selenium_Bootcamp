package registrationpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage {


    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[3]/a")
    public WebElement createAccountLink;
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement inputFirstNameField;
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement inputLastNameField;
    @FindBy(xpath = "//input[@id='email_address']")
    public WebElement inputEmailField;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement inputPasswordField;
    @FindBy(xpath = "//input[@id='password-confirmation']")
    public WebElement inputConfirmPasswordField;

    @FindBy(xpath = "//button[@class='action submit primary']/span[.='Create an Account']")
    public WebElement createAccountButton;
    @FindBy(xpath = "//div[.='Thank you for registering with Main Website Store.']")
    public WebElement registrationResultText;

    public RegistrationPage(){
        PageFactory.initElements(driver,this);
    }

    public void clickCreateAccountLink(){
        safeClickOnElement(createAccountLink);
    }

    public void enterFirstName(String firstName){
        sendKeysToElement(inputFirstNameField, firstName);
    }

    public void enterLastName(String lastName){
        sendKeysToElement(inputLastNameField, lastName);
    }
    public void enterEmail(String email){
        sendKeysToElement(inputEmailField, email);
    }
    public void enterStrengthPassword (String password){
        sendKeysToElement(inputPasswordField, password);
    }

    public void confirmPassword (String password){
        sendKeysToElement(inputConfirmPasswordField, password);
    }

    public void clickOnCreateAccountButton(){
        safeClickOnElement(createAccountButton);
    }

    public void doRegistration(String firstName,String lastName,String email,String password){
        clickCreateAccountLink();
        enterFirstName(firstName);
        enterLastName(lastName);
        enterEmail(email);
        enterStrengthPassword(password);
        confirmPassword(password);
        clickOnCreateAccountButton();




    }
}