package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Driverutility;

public class LoginPage extends WebTestBase {
    @FindBy(id="username")
    WebElement userNameTextBox;
    @FindBy(id="password")
    WebElement passwordTextBox;
    @FindBy(name ="login")
    WebElement loginButton;
    @FindBy(xpath = "//a[text()='Lost your password?']")
    WebElement lostPasswordBtn;
    @FindBy(id ="user_login")
    WebElement emailTextBox;
    @FindBy(xpath = "//input[@value='Reset password']")
    WebElement resetPasswordBtn;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    public void login(String username, String pasword) {
        userNameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(pasword);
        Driverutility.waitUntilElementClickable(loginButton);
    }
    public void recoverPassword(String email){
        Driverutility.waitUntilElementClickable(lostPasswordBtn);
        emailTextBox.sendKeys(email);
        Driverutility.waitUntilElementClickable(resetPasswordBtn);
    }
}
