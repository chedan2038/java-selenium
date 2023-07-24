package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static common.Config.PLATFORM_AND_BROWSER;
import static common.Constants.TimeoutVariable.IMPLICIT_WAIT;


public class CommonActions {


    public static WebDriver createDriver() {

        WebDriver driver = null;

        switch (PLATFORM_AND_BROWSER) {

            case "win_chrome":

                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");

                driver = new ChromeDriver(options);
                break;

            case "win_firefox":
                driver = new FirefoxDriver();
                break;

            default:
                Assert.fail("Incorrect platform for browser name: " + PLATFORM_AND_BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);

        return driver;
    }
}
