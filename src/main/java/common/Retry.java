package common;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import static common.Constants.MAX_RETRY;


public class Retry implements IRetryAnalyzer {
    private int actualRetry = 1;

    public boolean retry(ITestResult result) {
        if (actualRetry <= MAX_RETRY) {
            actualRetry++;
            return true;
        }
        return false;
    }
}