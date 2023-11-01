package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Driverutility;

public class Product  extends WebTestBase{
     @FindBy(xpath = "//img[@alt='Campos Superior Blend']")
     WebElement product;

     public Product(){
        PageFactory.initElements(driver, this);
    }
    public void clickOnSelectProduct(){
        Driverutility.waitUntilElementClickable(product);
  }
}
