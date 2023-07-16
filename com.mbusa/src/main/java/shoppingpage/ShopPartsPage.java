package shoppingpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPartsPage extends BasePage {

    public ShopPartsPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[.='Service, Parts & Tires']")
    public WebElement servicePartsTires;
    @FindBy(xpath = "//a[.='Shop Tires']")
    public WebElement shopTiresButton;
    @FindBy(xpath = "//a[contains(.,'By Size')]")
    public WebElement bySizeButton;

    @FindBy(xpath = "//select[@id='width']")
    public WebElement widthButton;

    @FindBy(xpath = "//select[@id='ratios']")
    public WebElement ratioButton;
    @FindBy(xpath = "//select[@id='diameters']")
    public WebElement diameterButton;

    @FindBy(xpath = "//button[@class='button button--primary button--full button button--primary stateful-button  stateful-btn--error']")
    public WebElement shopNowButton;

    @FindBy(xpath = "//h2[@class='dealer-primary__sub d-none d-md-block']")
    public WebElement descriptiveText;
    public void clickOnServicePartsTires(){
        safeClickOnElement(servicePartsTires);
    }

    public void clickOnShopTiresButton(){
        safeClickOnElement(shopTiresButton);
        switchToTab();
    }
    public void clickOnBySizeButton(){
        safeClickOnElement(bySizeButton);
    }

    public void clickOnWidthButton(){
        selectFromDropdownByVisibleText(widthButton,"165");
    }
    public void clickOnRatioButton(){
        selectFromDropdownByValue(ratioButton,"60");
    }
    public void clickOnDiameterButton(){
        selectFromDropdownByVisibleText(diameterButton,"15");
    }
    public void clickOnShopNowButton(){
        safeClickOnElement(shopNowButton);
    }

    public void doShopParts(){
        clickOnServicePartsTires();
        clickOnShopTiresButton();
        clickOnBySizeButton();
        clickOnWidthButton();
        clickOnRatioButton();
        clickOnDiameterButton();
        clickOnShopNowButton();
    }

}