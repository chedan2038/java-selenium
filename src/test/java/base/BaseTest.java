package base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.cian.HomePageCian;
import pages.cian.LoginPage;

import static common.Config.*;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePageCian homePageCian = new HomePageCian(driver);
    protected LoginPage loginPage = new LoginPage(driver);


    @AfterSuite
    public void clearCookiesAndLocalStorage() {

        if (CLEAR_COOKIE_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite(alwaysRun = true)
    public void close1() {
        if (CLOSE_BROWSER_AFTER_SUITE) {
            driver.quit();
        }
    }

    @AfterGroups(alwaysRun = true)
    public void close2() {
        if (CLOSE_BROWSER_AFTER_GROUP) {
            driver.quit();
        }
    }

    @AfterTest(alwaysRun = true)
    public void close3() {
        if (CLOSE_BROWSER_AFTER_Test) {
            driver.quit();
        }
    }

    @AfterClass(alwaysRun = true)
    public void close4() {
        if (CLOSE_BROWSER_AFTER_Class) {
            driver.quit();
        }
    }


}



