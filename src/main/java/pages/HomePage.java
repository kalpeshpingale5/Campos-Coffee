package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Driverutility;

import java.io.IOException;

public class HomePage extends WebTestBase {
    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
    WebElement loginElement;
    @FindBy(xpath = "//button[@title='Close']")
     WebElement closeFirstAdButton;
    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closeSecondAdButton;
    @FindBy(xpath = "//a[text()='Our Story']")
    WebElement ourStory;
    @FindBy(xpath = "(//li[@id='menu-item-372795']//following::a[@class='menu__ul__li__a'])[1]")
    WebElement history;
    @FindBy(xpath = "//a[text()='News']")
    WebElement news;
    @FindBy(xpath = "//div[@class='cell']//child::h2")
    WebElement checkOutHeadline;
    @FindBy(xpath = "//input[@id='s']")
    WebElement searchBtn;
    @FindBy(xpath = "//input[@class='search__input']")
    WebElement searchInput;
    @FindBy(xpath = "//input[@id='searchsubmit']")
    WebElement searchSubmit;
    @FindBy(xpath = "//h4[text()='Welcome to the new camposcoffee.com']")
    WebElement selectWelcomeHeadline;
    @FindBy(xpath = "//h2[@class='article-inner-content-header-title']")
    WebElement viewWelcomeNews;
    @FindBy(id ="input_13_1")
    WebElement email;
    @FindBy(id ="gform_submit_button_13")
    WebElement submitBtn;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    public void closeFirstAdButton(){
        Driverutility.waitUntilElementClickable(closeFirstAdButton);
    }
    public void closeSecondAdButton(){
        Driverutility.waitUntilElementClickable(closeSecondAdButton);
    }
    public void clickOnLoginButton(){
        Driverutility.waitUntilElementClickable(loginElement);
    }
    public void actionOurStoryButton(){
        Driverutility.actionMoveToElement(ourStory);
    }
    public void clickOnHistoryButton(){
        Driverutility.waitUntilElementClickable(history);
    }
    public void clickOnNewsButton(){
        Driverutility.waitUntilElementClickable(news);
    }
    public void clickEmailAndSubmitButton(){
        Driverutility.sendData(email, "kalpeshjpingale1@gmail.com");
        Driverutility.waitUntilElementClickable(submitBtn);
    }
    public void scrollUpDown() throws InterruptedException {
        Driverutility.scrollUpDownWindow();
    }
    public void screenShotMethod() throws IOException {
        Driverutility.takeScreenShot();
    }
    public void selectSearchContent(String searchInputText){
        searchInput.sendKeys(searchInputText);
        Driverutility.waitUntilElementClickable(searchBtn);
        Driverutility.waitUntilElementClickable(searchSubmit);

    }
    public void selectWelcomeHeadlineNews(){
        Driverutility.waitUntilElementClickable(selectWelcomeHeadline);
        Driverutility.scrollDownByVisibleText(viewWelcomeNews);
    }
    public void newWindowHandel() throws InterruptedException{
        Driverutility.waitUntilElementClickable(news);
        Driverutility.visitToCamposCoffeeShop();
    }
}
