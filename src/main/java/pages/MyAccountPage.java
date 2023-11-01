package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Driverutility;

public class MyAccountPage extends WebTestBase {
    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccountText;
    @FindBy(xpath = "//a[text()='Orders']")
    WebElement order;
    @FindBy(xpath = "//a[@class='woocommerce-Button button']")
    WebElement product;
    @FindBy(xpath = "//a[text()='Addresses']")
    WebElement addressButton;
    @FindBy(xpath = "//a[text()='Account details']")
    WebElement accountDetailsBtn;
    @FindBy(id = "password_current")
    WebElement currentPassword;
    @FindBy(id = "password_1")
    WebElement newPassword;
    @FindBy(id = "password_2")
    WebElement confirmPassword;

    public MyAccountPage(){
        PageFactory.initElements(driver, this);
    }
    public  String textOfMyAccount(){
        return Driverutility.getTextElement(myAccountText);
    }
    public void clickOnOrderButton(){
        Driverutility.waitUntilElementClickable(order);
    }
    public void clickOnProductButton(){
        Driverutility.waitUntilElementClickable(product);
    }
    public void clickOnAddressButton(){
        Driverutility.waitUntilElementClickable(addressButton);
    }
    public void clickOnAccountDetails() {
        Driverutility.waitUntilElementClickable(accountDetailsBtn);
    }
    public void verifyChangePassword(String currentPw, String newPw, String confirmPw) {
        Driverutility.waitUntilElementClickable(accountDetailsBtn);
        currentPassword.sendKeys(currentPw);
        newPassword.sendKeys(newPw);
        confirmPassword.sendKeys(confirmPw);
    }
}
