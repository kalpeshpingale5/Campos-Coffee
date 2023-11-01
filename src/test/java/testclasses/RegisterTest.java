package testclasses;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class RegisterTest extends WebTestBase {
    public RegisterPage registerPage;
    public HomePage homePage;
    RegisterTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        registerPage = new RegisterPage();
        homePage = new HomePage();
    }
    @Test
    public void verifyNewRegisterAccount(){
        homePage.closeFirstAdButton();
        homePage.closeSecondAdButton();
        homePage.clickOnLoginButton();
        registerPage.clickNewRegisterAccount(prop.getProperty("regEmail"), prop.getProperty("regPassword"));
    }
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}



