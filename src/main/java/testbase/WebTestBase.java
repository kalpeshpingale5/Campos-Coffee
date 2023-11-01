package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.Driverutility;

import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {
    public static Properties prop;
    public static WebDriver driver;
    public WebTestBase () {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/Config/config.properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            prop = new Properties();
            prop.load(fileInputStream);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void initialization(){
        String browserName = prop.getProperty("browserName");
        if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/main/resources/Driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/Driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/Driver/msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            throw new RuntimeException("Please select correct browser");
        }
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Driverutility.PAGE_LOAD_TIME));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Driverutility.IMPLICIT_WAIT));
    }
}
