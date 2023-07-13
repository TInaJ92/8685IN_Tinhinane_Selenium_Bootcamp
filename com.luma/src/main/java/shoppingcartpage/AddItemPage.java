package shoppingcartpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddItemPage extends BasePage {

    @FindBy(xpath = "//input[@id='search']")
    public WebElement inputSearchBar;

    @FindBy(xpath = "//button[@class='action search']")
    public WebElement buttonActionSearch;

    @FindBy(xpath = "//a[contains(.,'Hera Pullover Hoodie')]")
    public WebElement wantedItem;


    @FindBy(id="option-label-size-143-item-167")
    public WebElement sizeBox;

    @FindBy(id= "option-label-color-93-item-50")
    WebElement colorBox;

    @FindBy(id="product-addtocart-button")
    WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='message-success success message']/div[contains(.,'You added Hera Pullover Hoodie to your shopping cart.')]")
    WebElement testResult;
    public AddItemPage(){
        PageFactory.initElements(driver,this);


    }

    public void inputSearchTerm(String searchTerm){

        clearSendKeysToElement(inputSearchBar,searchTerm);
    }
    public void clickActionSearchButton(){

        safeClickOnElement(buttonActionSearch);
    }
    public void clickOnTheItem(){
        safeClickOnElement(wantedItem);
    }
    public void selectYourSize(){
        safeClickOnElement(sizeBox);
    }
    public void selectAColor(){
        safeClickOnElement(colorBox);
    }
    public void clickOnAddToCartButton(){
        safeClickOnElement(addToCartButton);
    }

    public void addItemToTheCart(String searchTerm){
        inputSearchTerm(searchTerm);
        clickActionSearchButton();
        clickOnTheItem();
        selectYourSize();
        selectAColor();
        clickOnAddToCartButton();


    }
}
