package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.BookerPlusLoginPage;

import java.io.File;


public class BookerPlusBaseTest {
    WebDriver driver;
    BookerPlusLoginPage bookerPlusLoginPage;

    @BeforeMethod
    public void beforeMethod() {

        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();

       // driver = new FirefoxDriver(new FirefoxBinary(new File("C:\\Browsers\\FirefoxPortable\\FirefoxPortable.exe")), null);
     // driver = new FirefoxDriver(new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\Firefox.exe")), null);

        driver.get("http://localhost:8080/erp/");
        driver.manage().window().maximize();
        bookerPlusLoginPage = new BookerPlusLoginPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
//        driver.quit();
    }
}
