package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testbase.WebTestBase;

public class MyAccountTest extends WebTestBase {
    public HomePage homePage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;
    MyAccountTest(){
        super();
    }
    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        homePage.closeFirstAdButton();
        homePage.closeSecondAdButton();
    }
    @Test
    public void verifyLoginAndAddAddress(){
        homePage.clickOnLoginButton();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        myAccountPage.clickOnAddressButton();
    }
    @Test
    public void verifyLoginAndChangePassword(){
        homePage.clickOnLoginButton();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        myAccountPage.verifyChangePassword(prop.getProperty("currentPassword"), prop.getProperty("newPassword"), prop.getProperty("confirmPassword"));
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}


