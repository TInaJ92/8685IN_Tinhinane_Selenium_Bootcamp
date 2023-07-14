package vehiclepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclePage extends BasePage {
    public VehiclePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//span[.='Vehicles']")
    public WebElement vehiclesButton;

    @FindBy(xpath = "//ul[@class='primary-global-header__vehicles-link-list']//a[.='Compare Models']")
    public WebElement compareModels;
    @FindBy(xpath = "//div[@class='wrapper compare-header__sticky-component']/div[1]//div[@class='compare-header-placeholder__add-label']")
    public WebElement addIcon;

    @FindBy(xpath = "//label[.='A 220 4MATIC Sedan']")
    public WebElement checkButton1;
    @FindBy(xpath = "//label[.='A 220 Sedan']")
    public WebElement checkButton2;

    @FindBy(xpath = "//button[@class='button button_primary button--wide']")
    public WebElement compareVehicles;

    @FindBy(xpath = "//h2[.='Feature Highlights']")
    public WebElement featuresHighlightsText;



    public void clickOnVehicleButton(){
        safeClickOnElement(vehiclesButton);
    }
    public void clickOnCompareModels(){
        safeClickOnElement(compareModels);
    }

    public void clickOnAddIcon(){
        safeClickOnElement(addIcon);
    }
    public void clickOnCheckButton1(){
        safeClickOnElement(checkButton1);
    }
    public void clickOnCheckButton2(){
        safeClickOnElement(checkButton2);
    }

    public void clickOnComparesVehicle(){
        safeClickOnElement(compareVehicles);
    }

    public void doCompare(){
        clickOnVehicleButton();
        clickOnCompareModels();
        clickOnAddIcon();
        clickOnCheckButton1();
        clickOnCheckButton2();
        clickOnComparesVehicle();
    }
}