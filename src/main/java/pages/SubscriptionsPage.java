package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Driverutility;

public class SubscriptionsPage extends WebTestBase {
    @FindBy(xpath = "(//a[text()='Subscriptions'])[2]")
    WebElement subscriptionsButton;
    @FindBy(xpath = "//a[text()='Beans and Ground']")
    WebElement beansAndGround;
    @FindBy(xpath = "//option[@value='250g']")
    WebElement bag250g;
    @FindBy(xpath = "//select[@class='pa_weight']")
    WebElement pleaseSelectButton;
    @FindBy(xpath = "//div[text()='Whole Beans']")
    WebElement selectWholeBeans;
    @FindBy(xpath = "//select[@class='pa_coffee']")
    WebElement coffeeSelectOption;
    @FindBy(xpath = "//option[text()='Coffee of the Month']")
    WebElement coffeeOption;
    @FindBy(xpath ="//label[@for='pa_frequency-weekly']")
    WebElement weeklyButton;
    @FindBy(xpath ="//select[@class='pa_subscription-length']")
    WebElement subscriptionLength;
    @FindBy(xpath = "//option[text()='6 months']")
    WebElement sixMonthsSelect;
    @FindBy(xpath = "//a[@class='button add-to-cart__button button--primary']")
    WebElement addToCartBtn;
    @FindBy(xpath = "//a[@class='button add-to-cart__button button--primary']//child::div")
    WebElement price;
    @FindBy(xpath = "//a[text()='Checkout']")
    WebElement checkOutBtn;
    @FindBy(xpath = "//a[@class='quantity-input__icon quantity-input__icon--plus']")
    WebElement quantityAdd;

    public SubscriptionsPage(){
        PageFactory.initElements(driver, this);
    }
    public void clickOnSubscriptionsButton(){
        Driverutility.actionMoveToElement(subscriptionsButton);
        Driverutility.waitUntilElementClickable(beansAndGround);
    }
    public void fillUpProductCamposSubscription() {
        Driverutility.waitUntilElementClickable(pleaseSelectButton);
        Driverutility.waitUntilElementClickable(bag250g);
        Driverutility.waitUntilElementClickable(selectWholeBeans);
        Driverutility.waitUntilElementClickable(coffeeSelectOption);
        Driverutility.waitUntilElementClickable(coffeeOption);
        weeklyButton.click();
        Driverutility.waitUntilElementClickable(subscriptionLength);
        Driverutility.waitUntilElementClickable(sixMonthsSelect);
        Driverutility.waitUntilElementClickable(quantityAdd);
        Driverutility.waitUntilElementClickable(price);
        Driverutility.waitUntilElementClickable(checkOutBtn);
    }
}
