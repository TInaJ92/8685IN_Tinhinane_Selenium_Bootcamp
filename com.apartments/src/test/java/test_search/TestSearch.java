package test_search;

import authenticationpage.SignInPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import searchpage.ResultSearchPage;
import searchpage.SearchPage;
import utils.ExcelData;

public class TestSearch extends BasePage {
       @Test(priority= 3, groups= {"BAT"},dataProvider = "searchDataProvider")

    public void testDoSearch(String searchTerm){
        HomePage homePage = new HomePage();
        SignInPage signInPage = new SignInPage();
        SearchPage searchPage= new SearchPage();
        ResultSearchPage resultSearchPage= new ResultSearchPage();

        homePage.clickOnSignInLink();
        String email="tinatebany@gmail.com";
        String password="Qwerty2023/*-";

        signInPage.doSignIn(email,password);

        searchPage.searchTerm(searchTerm);
        resultSearchPage.doSearch();


        Assert.assertTrue(isElementVisible(resultSearchPage.searchResult));

    }
    @DataProvider(name="searchDataProvider")
    public Object[][] searchDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSearch");
        return data;

    }
        @Test(priority= 4, groups= {"BAT"})
    public void testAddToFavorite(){
        HomePage homePage = new HomePage();
        SignInPage signInPage = new SignInPage();
        SearchPage searchPage= new SearchPage();
        ResultSearchPage resultSearchPage= new ResultSearchPage();


        homePage.clickOnSignInLink();
        String email="tinatebany@gmail.com";
        String password="Qwerty2023/*-";

        signInPage.doSignIn(email,password);
        String searchTerm="46240 IN, Indiana";
        searchPage.searchTerm(searchTerm);
        resultSearchPage.doSearch();
        resultSearchPage.clickOnHearts();
        Assert.assertTrue(isElementVisible(resultSearchPage.favoriteResult));

    }
}