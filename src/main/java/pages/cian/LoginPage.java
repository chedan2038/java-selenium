package pages.cian;

import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static pages.Locators.LoginPageLocators.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage IdLoginTest(String idMail, String password) {
        driver.findElement(anotherWayBtn).click();
        driver.findElement(idOrMailInput).sendKeys(idMail);
        driver.findElement(continueBtn).click();
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(continueBtn).click();
        waitElementIsVisible(driver.findElement(userLogo));
        return this;
    }

}
