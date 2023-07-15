package accountsettingpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettingPage extends BasePage {
    public AccountSettingPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//iframe[@id='iframeAccountSettings']")
    public WebElement accountSettingIframe;

    @FindBy(xpath = "//*[@id=\"cpid1-phone\"]")
    public WebElement phoneNumberInputField;

    @FindBy(xpath = "//*[@id=\"cpid1-addressLine1\"]")
    public WebElement streetAddressInputField;

    @FindBy(xpath = "//*[@id=\"cpid1-city\"]")
    public WebElement cityInputField;

    @FindBy(xpath = "//*[@id=\"save-settings-button\"]")
    public WebElement saveButton;



    public void switchToIframe() {

        switchToFrameByElement(accountSettingIframe);
    }

    public void enterPhoneNumber(String phoneNumber) {
        sendKeysToElement(phoneNumberInputField, phoneNumber);
    }

    public void enterStreetAddress(String streetAddress) {
        sendKeysToElement(streetAddressInputField, streetAddress);
    }

    public void enterCity(String city) {
        sendKeysToElement(cityInputField,city);
    }
    public void clickOnSaveButton() {
        safeClickOnElement(saveButton);
    }

    public void doSaveChanges(String phoneNumber,String streetAddress,String city){
        switchToIframe();
        enterPhoneNumber(phoneNumber);
        enterStreetAddress(streetAddress);
        enterCity(city);
        clickOnSaveButton();
    }
}