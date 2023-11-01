package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Driverutility;

public class Shop extends WebTestBase {
    @FindBy(id ="menu-item-4248")
    WebElement shopButton;
    @FindBy(id ="menu-item-58591")
    WebElement coffee;
    @FindBy(xpath = "//a[@class='filter-bar__inner__section__trigger filter__trigger button button--secondary']")
    WebElement filtersButton;
    @FindBy(xpath = "//label[text()='Christmas']")
    WebElement christmasBtn;
    @FindBy(xpath = "//a[@class='filter__menu__close filter__trigger']")
    WebElement filterCloseBtn;
    @FindBy(id ="sort")
    WebElement coffeeProduct;
    @FindBy(xpath = "//div[text()='Dark City']")
    WebElement darkCity;
    @FindBy(xpath = "//option[@value='500g']")
    WebElement bag500g;
    @FindBy(xpath = "//select[@class='pa_weight']")
    WebElement pleaseSelectButton;
    @FindBy(xpath = "//div[text()='Whole Beans']")
    WebElement selectWholeBeans;
    @FindBy(xpath = "//a[@class='quantity-input__icon quantity-input__icon--plus']")
    WebElement quantityAdd;
    @FindBy(xpath = "//a[@class='button add-to-cart__button button--primary']")
   // @FindBy(className = "button add-to-cart__button button--primary")
    WebElement price;
    @FindBy(xpath = "//div[text()='Campos Superior Capsules']")
    WebElement product;
    @FindBy(xpath = "//a[text()='Checkout']")
    WebElement checkOut;
    public Shop() {
        PageFactory.initElements(driver, this);
    }
    public void clickOnShopButton(){
        Driverutility.actionMoveToElement(shopButton);
    }
    public void clickOnCoffeeButton(){
        Driverutility.waitUntilElementClickable(coffee);
    }
    public void clickOnFilterProduct(){
        Driverutility.waitUntilElementClickable(filtersButton);
        Driverutility.waitUntilElementClickable(christmasBtn);
        Driverutility.waitUntilElementClickable(filterCloseBtn);
    }
    public void latestCoffeeProduct(){
        Driverutility.dropDownVisibleByIndex(1, coffeeProduct);
    }
    public void lowestCoffeeProduct(){
        Driverutility.dropDownVisibleByText(coffeeProduct, "Price (lowest)");
    }
    public void highestCoffeeProduct(){
        Driverutility.dropDownVisibleByValue("price-desc", coffeeProduct);
    }
    public void addDarkCityProduct(){
        Driverutility.actionMoveToElement(shopButton);
        Driverutility.waitUntilElementClickable(coffee);
        Driverutility.waitUntilElementClickable(darkCity);
        Driverutility.waitUntilElementClickable(pleaseSelectButton);
        Driverutility.waitUntilElementClickable(bag500g);
        Driverutility.waitUntilElementClickable(selectWholeBeans);
        Driverutility.waitUntilElementClickable(quantityAdd);
        Driverutility.waitUntilElementClickable(price);
        Driverutility.waitUntilElementClickable(checkOut);
    }
    public void clickSelectProduct(){
        Driverutility.waitUntilElementClickable(product);
    }
    public void addCartButton() {
        Driverutility.actionMoveToElement(shopButton);
        Driverutility.waitUntilElementClickable(coffee);
        Driverutility.waitUntilElementClickable(darkCity);
        Driverutility.waitUntilElementClickable(pleaseSelectButton);
        Driverutility.waitUntilElementClickable(bag500g);
        Driverutility.waitUntilElementClickable(selectWholeBeans);
        Driverutility.waitUntilElementClickable(price);
        Driverutility.waitUntilElementClickable(checkOut);
    }
}
