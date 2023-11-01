package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import testbase.WebTestBase;

public class CafeFinderTest extends WebTestBase {
    public HomePage homePage;
    public CafeFinder cafeFinder;
    public LoginPage loginPage;
    CafeFinderTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        homePage = new HomePage();
        cafeFinder = new CafeFinder();
        loginPage = new LoginPage();
        homePage.closeFirstAdButton();
        homePage.closeSecondAdButton();
    }
    @Test
    public void verifyCafeFinderPageTitle(){
        cafeFinder.clickOnCafeFinder();
        cafeFinder.cafeFinderPageTitle();
    }
    @Test
    public void verifyCafeFinderPageUrl(){
        cafeFinder.clickOnCafeFinder();
        cafeFinder.cafeFinderPageURL();
    }
    @Test
    public void verifyToFindCafeNearMe() throws InterruptedException {
        cafeFinder.clickOnCafeFinder();
        cafeFinder.clickOnFindButton();
        Thread.sleep(5000);
    }
    @Test
    public void verifyFindElement() throws InterruptedException {
        cafeFinder.scrollDownVisibleText();
        Thread.sleep(3000);
    }

    @Test
    public void verifyToFindingCafeNearMe(){
        homePage.clickOnLoginButton();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        cafeFinder.clickOnCafeFinder();
        cafeFinder.clickOnFilterButton();
        cafeFinder.clickOnNearMeButton();
        cafeFinder.clickOnFindButton();
    }
    @Test
    public void verifyToFindingCafeAtPostCode(){
        cafeFinder.clickOnCafeFinder();
        cafeFinder.clickOnFilterButton();
        cafeFinder.clickOnPostCodeButton();
        cafeFinder.clickOnInputPostCode(prop.getProperty("cityName"));
        cafeFinder.clickOnFindButton();
    }
    @Test
    public void verifyVisitToNewTownCamposCoffee() {
        cafeFinder.clickOnCafeFinder();
        cafeFinder.clickOnMoreInfo();
    }
    @Test
    public void verifyVisitToNewTownCamposCoffeeShop() throws InterruptedException{
        cafeFinder.clickOnNewTownCoffeeShopMoreInfo();
    }
    @AfterMethod
    public void tearDown()  {
        driver.close();
    }
}
