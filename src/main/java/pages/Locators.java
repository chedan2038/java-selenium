package pages;

import org.openqa.selenium.By;

public class Locators {


    public static class HomePageCianLocators {
        public static final By cityBtn = By.xpath("//span[@class='_025a50318d--text--SCFDt']");
        public static final By cityFindBtn = By.xpath("//button[@class='_025a50318d--button--Cp1dl _025a50318d--button--IqIpq _025a50318d--XS--Q3OqJ _025a50318d--button--OhHnj']");

        public static final By findBtn = By.xpath("//span[@class='_025a50318d--container--sfUjh']//a[@class='_025a50318d--button--ljPOU']");
        public static final By countRooms = By.xpath("//div[@class='_025a50318d--container--H8VA5 _025a50318d--container--wzf_u']//button");
        public static final By pressedButtons = By.xpath("//button[@class='_025a50318d--button--i1_mM _025a50318d--button--active--R3YUJ']");
        public static final By currentCity = By.cssSelector("div[data-name='GeoSwitcher']>button>span");
    }


    public static class ListingPageCianLocators {

        public static final By searchInfo = By.cssSelector("[data-name=Breadcrumbs]>h1");

    }

    public static class LoginPageLocators {

        public static final By anotherWayBtn = By.cssSelector("button[data-name='SwitchToEmailAuthBtn']");
        public static final By idOrMailInput = By.cssSelector("input[name='username']");
        public static final By continueBtn = By.cssSelector("button[data-name='ContinueAuthBtn']");
        public static final By passwordInput = By.cssSelector("input[name='password']");
        public static final By userLogo = By.cssSelector("a[data-name='UserAvatar']");


    }
}