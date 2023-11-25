package Tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class TestBase extends AbstractTestNGCucumberTests {

    public static WebDriver driver;

    @BeforeSuite
    public void setup ()
    {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.navigate().to("https://swinji.azurewebsites.net");
    }


    @AfterSuite
    public void teardown ()
    {
        driver.quit();
    }
}
