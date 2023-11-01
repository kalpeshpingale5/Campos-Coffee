package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.Product;
import testbase.WebTestBase;

public class LoginTest extends WebTestBase {

    public HomePage homePage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;
    public Product product;
    LoginTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        product = new Product();
        homePage.closeFirstAdButton();
        homePage.closeSecondAdButton();
    }
    @Test
    public void verifyLoginWithValidUsernameAndPassword(){
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnLoginButton();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        String myAccountPageText = myAccountPage.textOfMyAccount();
        softAssert.assertEquals(myAccountPageText,"MY ACCOUNT", "Text should be match");
        softAssert.assertAll();
    }
    @Test
    public void verifyLoginValidUsernameAndPassword(){
        homePage.clickOnLoginButton();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        myAccountPage.clickOnOrderButton();
        myAccountPage.clickOnProductButton();
        product.clickOnSelectProduct();
    }
    @Test
    public void verifyRecoverPassword(){
        homePage.clickOnLoginButton();
        loginPage.recoverPassword(prop.getProperty("email"));
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
