package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Driverutility;

import java.util.Set;

public class CafeFinder extends WebTestBase {
    @FindBy(xpath = "//a[text()='Café Finder']")
    WebElement cafeFinder;
    @FindBy(xpath = "//div[text()='Near Me']")
    WebElement nearMe;
    @FindBy(xpath = "//li[@class='filter_item-list-item ng-binding ng-scope']")
    WebElement postCodeBtn;
    @FindBy(id ="locationSearch")
    WebElement inputTab;
    @FindBy(xpath = "//icon[@class='filter_item-icon']")
    WebElement clickFilterIcon;
    @FindBy(id ="locationSearchButton")
    WebElement findBtn;
    @FindBy(xpath = "(//a[text()='More info'])[1]")
    WebElement newTownCoffeeShopMoreInfo;
    @FindBy(xpath = "//a[text()='Campos Coffee South Yarra ']")
    WebElement findLookingElement;
    @FindBy(className ="mc-closeModal")
    WebElement closeModel;
    public CafeFinder(){
        PageFactory.initElements(driver, this);
    }
    public void cafeFinderPageTitle(){
        String title = driver.getTitle();
        System.out.println(title);
    }
    public void cafeFinderPageURL(){
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }
    public void clickOnCafeFinder(){
        Driverutility.waitUntilElementClickable(cafeFinder);
    }
    public void clickOnNearMeButton(){
        Driverutility.waitUntilElementClickable(nearMe);
    }
    public void navigateToFilterIcon(){
        Driverutility.actionMoveToElement(clickFilterIcon);
    }
    public void clickOnInputPostCode(String cityname){
        inputTab.sendKeys(cityname);
    }
    public void scrollDownVisibleText(){
        Driverutility.waitUntilElementClickable(cafeFinder);
        Driverutility.scrollDownByVisibleText(findLookingElement);
    }
    public void clickOnFilterButton(){
        Driverutility.waitUntilElementClickable(clickFilterIcon);
    }
    public void clickOnPostCodeButton(){
        Driverutility.waitUntilElementClickable(postCodeBtn);
    }

    public void clickOnNewTownCoffeeShopMoreInfo() throws InterruptedException {
        Driverutility.waitUntilElementClickable(cafeFinder);
        Driverutility.waitUntilElementClickable(newTownCoffeeShopMoreInfo);
        Driverutility.visitToCamposCoffeeShop();
    }
    public void clickOnFindButton(){
        Driverutility.waitUntilElementClickable(findBtn);
    }
    public void clickOnMoreInfo(){
        Driverutility.waitUntilElementClickable(newTownCoffeeShopMoreInfo);
    }
    public void clickOnCloseModeliFrame(){
        Driverutility.waitUntilElementClickable(closeModel);
    }
}
