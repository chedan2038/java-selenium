package pages.cian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

import static pages.Locators.HomePageCianLocators.*;
import static pages.Locators.ListingPageCianLocators.searchInfo;


public class HomePageCian extends BasePage {

    public HomePageCian(WebDriver driver) {
        super(driver);
    }

    public HomePageCian cityCustom(String city) {
        driver.findElement(cityBtn).click();

        String defaultXpath = "//li[@class='_025a50318d--city--tVtAu'] //button [text()='";
        int size = defaultXpath.length();
        StringBuilder sb = new StringBuilder(defaultXpath);
        sb.insert(size, city + "']");
        String sbString = sb.toString();
        driver.findElement(By.xpath(sbString)).click();

        driver.findElement(cityFindBtn).click();

        String defaultXpathChecker = "//span[@class='_025a50318d--text--SCFDt'] [text()='";
        StringBuilder sbChecker = new StringBuilder(defaultXpathChecker);
        int sizeChecker = defaultXpathChecker.length();
        sbChecker.insert(sizeChecker, city + "']");
        String stringChecker = sbChecker.toString();
        waitElementIsVisible(driver.findElement(By.xpath(stringChecker)));

        Assert.assertEquals(driver.findElement(currentCity).getText(), city, "Selected city and the actual city are different");
        return this;
    }

    public HomePageCian clickToFind() {
        driver.findElement(findBtn).click();
        return this;
    }


    public HomePageCian clearCountRooms() {

        driver.findElement(countRooms).click();
        int size = driver.findElements(pressedButtons).size();
        for (int i = size - 1; i >= 0; i--) {
            driver.findElement(pressedButtons).click();
        }
        driver.findElement(countRooms).click();
        return this;
    }

    public HomePageCian enterCountRooms(int roomCount) {

        String optionRoom = "//ul[@class='_025a50318d--list--gT6p6']//li [";
        StringBuilder sb = new StringBuilder(optionRoom);
        int length = sb.length();

        Assert.assertTrue(roomCount >= 1 & roomCount <= 6, "Wrong room count. Try from 1 to 6");

        sb.insert(length, roomCount + "]");
        String room = sb.toString();
        driver.findElement(countRooms).click();
        driver.findElement(By.xpath(room)).click();
        driver.findElement(countRooms).click();
        return this;
    }

    public HomePageCian checkCountRooms(int roomCount1, int roomCount2) {
        enterCountRooms(roomCount1);
        enterCountRooms(roomCount2);
        clickToFind();
        assert driver.findElement(searchInfo).getText().contains(String.valueOf(roomCount1));
        assert driver.findElement(searchInfo).getText().contains(String.valueOf(roomCount2));
        return this;
    }
}
