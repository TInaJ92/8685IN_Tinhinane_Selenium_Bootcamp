
package searchpage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModelSelectedPage extends BasePage {

    @FindBy(xpath = "//a[@href='/vehicles/all-electric/ix/sports-activity-vehicle/build-your-own.html']")
    public WebElement buildYourOwnButton1;

    @FindBy(xpath = "//a[@href='/build-your-own.html#/studio/24IJ']")
    public WebElement buildYourOwnButton2;

    @FindBy(xpath = "//div[@class='byo-rail-option-base selected']//div[@class='name byo-core-type label-2 theme-core']")
    public WebElement phytonicBlueColorButton;

    @FindBy(xpath = "//h1[@class='selected-option-headline byo-core-type theme-gkl headline-5']")
    public WebElement descriptiveText;
    public ModelSelectedPage(){
        PageFactory.initElements(driver,this);
    }

    public void clickOnBuildYourOwn1() {
        safeClickOnElement(buildYourOwnButton1);
    }
    public void clickOnBuildYourOwn2() {
        safeClickOnElement(buildYourOwnButton2);
    }
    public void clickOnPhytonicBlue() {
        safeClickOnElement(phytonicBlueColorButton);
    }

    public void buildYourOwn(){
        clickOnBuildYourOwn1();
        clickOnBuildYourOwn2();
        clickOnPhytonicBlue();
    }
}