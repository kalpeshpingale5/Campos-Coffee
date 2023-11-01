package testclasses;

import org.openqa.selenium.TimeoutException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import testbase.WebTestBase;

public class SubscriptionsTest extends WebTestBase {
    public HomePage homePage;
    public SubscriptionsPage subscriptionsPage;
    SubscriptionsTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        homePage = new HomePage();
        subscriptionsPage = new SubscriptionsPage();
        homePage.closeFirstAdButton();
        homePage.closeSecondAdButton();
    }
    @Test
    public void verifySubscriptionPage() {
        subscriptionsPage.clickOnSubscriptionsButton();
    }
    @Test
    public void verifyBeansAndGroundsProductDetailsAdd() throws TimeoutException{
        subscriptionsPage.clickOnSubscriptionsButton();
        subscriptionsPage.fillUpProductCamposSubscription();
    }
    @AfterMethod
    public void tearDown()  {
        driver.close();
    }
}
