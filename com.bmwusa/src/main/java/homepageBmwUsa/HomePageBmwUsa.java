package homepageBmwUsa;

import authontication.LoginPage;
import base.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePageBmwUsa extends BasePage {


    public HomePageBmwUsa() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//a[@href='http://mybmw.bmwusa.com']")
    public WebElement logInLink;
    public LoginPage clickOnLoginLink(){
        safeClickOnElement(logInLink);
        return new LoginPage();
    }
}