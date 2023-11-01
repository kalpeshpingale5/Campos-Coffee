package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Driverutility;

public class RegisterPage extends WebTestBase {
    @FindBy(xpath = "//a[text()='Click here']")
    WebElement clickRegisterBtn;
    @FindBy(id ="reg_email")
    WebElement registerEmailBox;
    @FindBy(id ="reg_password")
    WebElement registerPasswordBox;
    @FindBy(xpath = "//input[@value='Register']")
    WebElement registerBtn;
    public RegisterPage(){
        PageFactory.initElements(driver, this);
    }
    public void clickNewRegisterAccount(String regEmail, String regPassword){
        Driverutility.waitUntilElementClickable(clickRegisterBtn);
        registerEmailBox.sendKeys(regEmail);
        registerPasswordBox.sendKeys(regPassword);
        Driverutility.waitUntilElementClickable(registerBtn);
    }
}
