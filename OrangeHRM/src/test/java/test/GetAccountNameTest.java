package test;

import Utils.PageElements;
import Utils.BaseTest;
import Utils.param;
import org.junit.Assert;
import org.testng.annotations.Test;

public class GetAccountNameTest extends BaseTest {
    PageElements pageElements;

    @Test(dataProvider = "data", dataProviderClass = param.class)
    public void getAccountName(String username, String password) {
        pageElements = new PageElements(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        pageElements.enterUsername(username);
        pageElements.enterPassword(password);
        pageElements.clickLoginButton();
        Assert.assertNotEquals(pageElements.getAccountName(), "");
    }
}
