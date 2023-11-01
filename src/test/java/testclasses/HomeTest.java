package testclasses;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import testbase.WebTestBase;

import java.io.IOException;

public class HomeTest extends WebTestBase {
    public HomePage homePage;
    public LoginPage loginPage;
    HomeTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        homePage.closeFirstAdButton();
        homePage.closeSecondAdButton();
    }
    @Test
    public void verifyTakeScreenShot() throws IOException {
        homePage.clickOnNewsButton();
        homePage.screenShotMethod();
    }
    @Test
    public void verifyHomePageScrollUpDown() throws InterruptedException {
        homePage.scrollUpDown();
    }
    @Test
    public void verifyActionMoveToOurStoryElement() throws InterruptedException {
        homePage.actionOurStoryButton();
        Thread.sleep(3000);
    }
    @Test
    public void verifyEmailAndSubmitButton() throws InterruptedException {
        homePage.clickEmailAndSubmitButton();
        Thread.sleep(5000);
    }
    @Test
    public void verifyToForwardAndBackwardHomePage() throws InterruptedException{
        homePage.clickOnNewsButton();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.close();
    }
    @Test
    public void verifyHomepageSearchButton()  {
        homePage.selectSearchContent(prop.getProperty("searchInput"));
    }
    @Test
    public void verifySearchButtonAndReadNews() throws InterruptedException {
        homePage.selectSearchContent(prop.getProperty("searchInput"));
        homePage.selectWelcomeHeadlineNews();
        Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
