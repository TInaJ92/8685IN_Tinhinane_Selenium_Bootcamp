package resultpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends BasePage {

    public ResultPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[@class='srp-controls__count-heading']")
    public WebElement resultsNumber;

    @FindBy(xpath = "//ul[@class='srp-results srp-list clearfix']/li[2]//div[@class='s-item__image-wrapper image-treatment']")
    public WebElement desiredItem;

    @FindBy(xpath = "//a[@href='https://cart.payments.ebay.com/sc/add']//span[@class='ux-call-to-action__text']")
    public WebElement addCartButton;

    @FindBy(xpath = "//div[@class='app-atc-layer-redesign-content-wrapper ']//span[1]/span[.='Go to cart']")
    public WebElement goToCartButton;

    @FindBy(xpath = "//button[@class='btn btn--primary btn--large']")
    public WebElement goToCheckoutButton;

    public void clickOnDesiredItem(){
        safeClickOnElement(desiredItem);
        switchToTab();
    }
    public void clickOnAddCartButton(){
        safeClickOnElement(addCartButton);
    }
    public void clickOnGoToCartButton(){
        safeClickOnElement(goToCartButton);
    }


    public void doAddToCart(){
        clickOnDesiredItem();
        clickOnAddCartButton();
        clickOnGoToCartButton();

    }


}