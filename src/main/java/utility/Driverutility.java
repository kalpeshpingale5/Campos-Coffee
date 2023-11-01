package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class Driverutility extends WebTestBase {
    public static final long PAGE_LOAD_TIME = 50;
    public static final long IMPLICIT_WAIT = 50;
    public static final long EXPLICIT_WAIT = 50;
    public static WebDriverWait wait;
    public static Actions actions;
    public static Select select;

    public static void waitUntilElementClickable(WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static String getTextElement(WebElement element) {
        return element.getText();
    }

    public static void actionMoveToElement(WebElement element) {
        actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
    public static void scrollUpDownWindow() throws InterruptedException {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(4000);
        javascriptExecutor.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(3000);
    }

    public static void sendData(WebElement element, String textValue) {
        element.sendKeys(textValue);
    }
    public static void takeScreenShot() throws IOException{
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file, new File("C:\\Users\\vivek\\Downloads\\Screenshot (85).png"));
    }
    public static void dropDownVisibleByText(WebElement element , String visibleText){
        select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    public static void dropDownVisibleByIndex(int visibleIndex, WebElement element) {
        select = new Select(element);
        select.selectByIndex(visibleIndex);
    }
    public static void dropDownVisibleByValue(String visibleValue, WebElement element) {
        select = new Select(element);
        select.selectByValue(visibleValue);

    }
    public static void visitToCamposCoffeeShop() throws InterruptedException {
        String window = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for(String a : allWindows){
            if (!window.contentEquals(a)){
                driver.switchTo().window(a);
                Thread.sleep(5000);
                driver.close();
            }
        }
        driver.switchTo().window(window);
        Thread.sleep(5000);
        driver.close();
    }

    public static void scrollDownByVisibleText(WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",element);
    }

}
