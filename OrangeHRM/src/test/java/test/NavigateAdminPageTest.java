package test;

import Utils.PageElements;
import Utils.BaseTest;
import Utils.param;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class NavigateAdminPageTest extends BaseTest {
    PageElements pageElements;

    @Test(dataProvider = "data", dataProviderClass = param.class)
    public void navToAdmin(String username, String password) {
        pageElements = new PageElements(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pageElements.enterUsername(username);
        pageElements.enterPassword(password);
        pageElements.clickLoginButton();
        pageElements.navToAdminButton();
        Assert.assertEquals(pageElements.verifyAdminPage(), "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
    }
}
