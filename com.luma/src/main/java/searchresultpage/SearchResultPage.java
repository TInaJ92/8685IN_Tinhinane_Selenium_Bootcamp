package searchresultpage;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends BasePage {
    @FindBy(xpath = "//span[@class='base']")
    public WebElement textSearchTerm;

    @FindBy(xpath = "//div[@class='message notice']/div[contains(.,'Your search returned no results.')]")
    public WebElement resultInvalidSearchTerm;
    public SearchResultPage(){
        PageFactory.initElements(driver,this);

    }
    public List<WebElement> getSearchResults(){
        return driver.findElements(By.xpath("//div[@class='search results']"));

    }
}