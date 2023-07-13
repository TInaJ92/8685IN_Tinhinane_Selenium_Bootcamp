package shoppingcartpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddModifyCartPage extends BasePage {
    public AddModifyCartPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='action showcart']")
    public WebElement cartButton;


    @FindBy(xpath = "//a[contains(.,'Remove')]")
    public WebElement removeButton;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement modifyButton;

    @FindBy(xpath = "//img[@alt='Joust Duffle Bag']")
    public WebElement productItemLink;

    @FindBy(xpath = "//button[@title='Update']")
    public WebElement updateButton;

    @FindBy(xpath = "//span[.='OK']")
    public WebElement okButton;

    @FindBy(xpath = "//strong[@class='subtitle empty']")
    public WebElement noItemsInCart;
    public void addToCartItem() {
        hoverOverElement(productItemLink);
        clickOnElement(addToCartButton);
        clickOnElement(addToCartButton);

    }

    public void modifyItem()
    {
        clickOnElement(cartButton);
        clearSendKeysToElement(modifyButton,"2");
        clickOnElement(updateButton);
    }

    public void removeCartItem()
    {
        clickOnElement(removeButton);
        clickOnElement(okButton);

    }

}