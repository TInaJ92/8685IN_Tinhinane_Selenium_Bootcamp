package contactuspage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BasePage {

    public ContactUsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[.='Contact Us']")
    public WebElement contactUsButton;


    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameInput;


    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id='telephone']")
    public WebElement phoneInput;

    @FindBy(xpath = "//textarea[@id='comment']")
    public WebElement commentInput;
    @FindBy(xpath= "//button[@class='action submit primary']")
    public WebElement submitButton;
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement thankYouForContactingUsMessage;


    public void doContactUs(String name, String email, String phoneNumber, String comment){
        safeClickOnElement(contactUsButton);
        sendKeysToElement(nameInput,name);
        sendKeysToElement(emailInput,email);
        sendKeysToElement(phoneInput,phoneNumber);
        sendKeysToElement(commentInput,comment);
        clickOnElement(submitButton);






    }
}

