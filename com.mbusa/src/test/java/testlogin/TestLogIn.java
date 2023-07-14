//package testlogin;
//
//import base.BasePage;
//import homepage.HomePage;
//import loginpage.LoginPage;
//import loginpage.PasswordPage;
//
//
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import utils.ExcelData;
//
//public class TestLogIn extends BasePage {
//
//    @Test(priority = 1, groups = {"BAT"}, dataProvider = "logindataprovider")
//    public void testLogin(String email, String password) {
//        HomePage homePage = new HomePage();
//       LoginPage loginPage = new LoginPage();
//        PasswordPage passwordPage = new PasswordPage();
//
//        homePage.login();
//        loginPage.authenticateEmail(email);
//        passwordPage.authenticatePassword(password);
//
//
//    }
//
//
//    @DataProvider(name = "logindataprovider")
//    public String[][] loginDataProvider() {
//
//        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
//        ExcelData ex = new ExcelData(path);
//        String data[][] = ex.readStringArrays("login_mercedes");
//        return data;
//
//    }
//}