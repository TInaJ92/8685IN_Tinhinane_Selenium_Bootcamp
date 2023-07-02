package homepageApartments;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageApartments extends BasePage {

    @FindBy(xpath = "//img[@alt=Apartments.com Logo]")
    public WebElement logo;

    public HomepageApartments() {
        PageFactory.initElements(driver, this);
    }
}