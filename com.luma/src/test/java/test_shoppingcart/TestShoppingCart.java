package test_shoppingcart;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import shoppingcartpage.AddModifyCartPage;

public class TestShoppingCart extends BasePage {

    @Test(priority = 9, groups = {"BAT"})
    public void addModifyRemoveFromCartData() {
       HomePage homepage = new HomePage();
        homepage.doSearch("Duffle Bag");
        AddModifyCartPage addModifyRemove=new AddModifyCartPage();
        addModifyRemove.addToCartItem();
        addModifyRemove.modifyItem();
        addModifyRemove.removeCartItem();
        Assert.assertTrue(isElementVisible(addModifyRemove.noItemsInCart));

    }
}