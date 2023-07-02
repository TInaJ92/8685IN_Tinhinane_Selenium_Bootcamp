package authontication;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

public  DashboardPage() {
    PageFactory.initElements(driver,this);
}
    @FindBy(xpath = "//a[@id='accountsBtn']")
    public WebElement myAccountButton;

}
