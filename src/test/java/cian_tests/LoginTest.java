package cian_tests;

import base.BaseTest;
import common.Retry;
import org.testng.annotations.Test;

import static common.Constants.Urls.CIAN_LOGIN_PAGE;

public class LoginTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class, groups = {"smoke"})
    public void loginByIdMail() {

        basePage.open(CIAN_LOGIN_PAGE);
        loginPage
                .IdLoginTest("95255344", "EaXvQeEaXvQe");

    }
}