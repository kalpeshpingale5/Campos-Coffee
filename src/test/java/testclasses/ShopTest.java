package testclasses;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Shop;
import pages.HomePage;
import testbase.WebTestBase;
import utility.Driverutility;

public class ShopTest extends WebTestBase {
    public HomePage homePage;
     public Shop shop;


    ShopTest(){super();}
    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
        shop = new Shop();
        homePage.closeFirstAdButton();
        homePage.closeSecondAdButton();
        shop.clickOnShopButton();
    }
    @Test
    public void verityCoffeeSelect(){
        shop.clickOnCoffeeButton();
    }
    @Test
    public void verifyLowestCoffeeProduct()  {
        shop.clickOnCoffeeButton();
        shop.lowestCoffeeProduct();
    }
    @Test
    public void verifyHighestCoffeeProduct() {
        shop.clickOnCoffeeButton();
        shop.highestCoffeeProduct();
    }
    @Test
    public void verifyLatestCoffeeProduct()  {
        shop.clickOnCoffeeButton();
        shop.latestCoffeeProduct();
    }
    @Test
    public void verifyFillUpProductDetails() throws TimeoutException{
       shop.addDarkCityProduct();
    }
    @Test
    public void verifySelectProduct() throws TimeoutException{
        shop.clickSelectProduct();
    }
    @Test
    public void verifyFilterProduct(){
        shop.clickOnCoffeeButton();
        shop.clickOnFilterProduct();
    }
    @Test
    public void verifyAddCartProduct() throws  TimeoutException{
        shop.addCartButton();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}

