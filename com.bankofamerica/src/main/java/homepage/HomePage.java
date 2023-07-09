package homepage;

import base.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='multi-level-navigation_continue-to-bankofamerica_com']")
    public WebElement continueToBoaButton;

    @FindBy(xpath = "//tbody//tr//td[1]")
    public WebElement FDICDataTable;

    @FindBy(xpath = "//tbody//tr//td[2]")
    public WebElement AreNotBankGuaranteedTable;

    @FindBy(xpath = "//tbody//tr//td[3]")
    public WebElement mayLoseValueTable;

    @FindBy(xpath = "//div[@class='disclosures__item disclosures__item--generic text']//table")
    public WebElement tableForBoa;

    public void clickOnBoaButton(){
        safeClickOnElement(continueToBoaButton);

    }
    public int getRowCount() {
        return driver.findElements(By.xpath("//div[@class='disclosures__item disclosures__item--generic text']//table")).size();
    }

    public int getCellCountInRow(int rowIndex) {
        return driver.findElements(By.cssSelector("#tableId tr:nth-child(" + rowIndex + ") td")).size();
    }
}