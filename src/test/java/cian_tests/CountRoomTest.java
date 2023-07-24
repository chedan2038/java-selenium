package cian_tests;

import base.BaseTest;
import common.Retry;
import org.testng.annotations.Test;

import static common.Constants.Urls.CIAN_HOME_PAGE;

public class CountRoomTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class, groups = {"smoke"})
    public void pictureListing() {
        basePage.open(CIAN_HOME_PAGE);
        homePageCian
                .clearCountRooms()
                .checkCountRooms(1, 3);

    }

}